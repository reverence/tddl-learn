package com.taobao.tddl.common.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 按照access顺序的LRU缓存
 * 由于使用了只有jdk1.6才有的类ConcurrentSkipListSet,所以只支持jdk1.6
 *
 * @author guangxia
 * @since 1.0, 2010-2-10 上午11:24:41
 */
public class LRUConcurrentHashMap<K, V> {

	private static final long serialVersionUID = -5998305755518605558L;

	static class Item<K, V> implements Comparable<Item<K, V>> {
		final K key;
		final V value;
		volatile int chunkId;
		Item(K key, V value) {
			this.key = key;
			this.value = value;
		}
		@SuppressWarnings("unchecked")
		public int compareTo(Item<K, V> o) {
			return ((Comparable<K>)key).compareTo(o.key);
		}
	}

	static class LogChunk<K, V> {
		final int id;
		final AtomicInteger preIndex = new AtomicInteger(0);
		final AtomicInteger auctalSize = new AtomicInteger(0);
		final ConcurrentSkipListSet<Item<K, V>> logs;
		final int capacity;
		LogChunk(int id, int capacity) {
			if(capacity == 0) {
				throw new IllegalArgumentException("The capacity can't be 0!");
			}
			this.capacity = capacity;
			this.id = id;
			logs = new ConcurrentSkipListSet<Item<K, V>>();
		}
		boolean log(Item<K, V> item) {
			int index = preIndex.getAndIncrement();
			if(index >= capacity) {
				if(logs.contains(item)) {
					preIndex.decrementAndGet();
					return true;
				} else {
					return false;
				}
			}
			if(logs.add(item)) {
				auctalSize.incrementAndGet();
			} else {
				//回滚preIndex
				preIndex.decrementAndGet();
			}
			return true;
		}
		//这个操作没有加锁,可能存在问题，先留着，以后再考虑
		//unused
		/*
		void remove(Item<K, V> item) {
			logs.remove(item);
			auctalSize.decrementAndGet();
		}*/
	}

	static class Chunks<K, V> {
		final LogChunk<K, V> oldest;
		final LogChunk<K, V> last;
		final LogChunk<K, V> current;
		Chunks(Chunks<K, V> lastChunks, int new_id, int capacity) {
			this.oldest = lastChunks.last;
			this.last = lastChunks.current;
			this.current = new LogChunk<K, V>(new_id, capacity);
		}
		Chunks(int new_id, int capacity) {
			this.oldest = null;
			this.last = null;
			this.current = new LogChunk<K, V>(new_id, capacity);
		}
		//先写新的accessLog后删旧的accessLog可能造成刚写入的数据就被删了，但是这样概率比较小，且影响不大
		//如果改成先删旧的后写新的话，可能造成一个数据在hashMap中有，而accessLog中没有，这样会引起内存泄漏，虽然概率不大
		boolean log(Item<K, V> item) {
			if(current.log(item) == false) {
				return false;
			}
			boolean removed = false;
			if(item.chunkId == 0) {
				removed = true;
			}
			if(!removed && oldest != null) {
				if(item.chunkId == oldest.id) {
					oldest.logs.remove(item);
					removed = true;
				}
			}
			if(!removed && last != null) {
				if(item.chunkId == last.id) {
					last.logs.remove(item);
					removed = true;
				}
			}
			item.chunkId = current.id;
			return true;
		}
	}

	static class AccessLog<K, V> {
		final AtomicInteger chunkId = new AtomicInteger(1);
		volatile Chunks<K, V> chunks;
		final int capacity;
		final ReentrantLock lock = new ReentrantLock();
		final ConcurrentHashMap<K, Item<K, V>> hashMap;
		AccessLog(ConcurrentHashMap<K, Item<K, V>> hashMap, int capacity) {
			this.hashMap = hashMap;
			this.capacity = capacity;
			chunks = new Chunks<K, V>(chunkId.getAndIncrement(), capacity);
		}
		void log(Item<K, V> item) {
			if(chunks.log(item)) {
				return;
			}
			Chunks<K, V> local_chunks = null;
			lock.lock();
			try {
				local_chunks = chunks;
				if(local_chunks.log(item)) {
					return;
				}
				Chunks<K, V> new_chunks = new Chunks<K, V>(local_chunks, chunkId.getAndIncrement(), capacity);
				new_chunks.log(item);
				chunks = new_chunks;
			} finally {
				lock.unlock();
			}
			clearOldest(local_chunks.last);
		}

		void clearOldest(LogChunk<K, V> oldestChunk) {
			if(oldestChunk == null) {
				return;
			}
			for(Item<K, V> item : oldestChunk.logs) {
				hashMap.remove(item.key);
			}
		}
	}

	static final int DEFAULT_CAPACITY = 386;
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	static final int DEFAULT_SEGMENTS = 16;

	private final ConcurrentHashMap<K, Item<K, V>> hashMap;
	private final AccessLog<K, V>[] accessLogs;
	private final int segmentShift;
	private final int segmentMask;

	@SuppressWarnings("unchecked")
	public LRUConcurrentHashMap(int capacity, int concurrencyLevel) {
		hashMap = new ConcurrentHashMap<K, Item<K, V>>(capacity, DEFAULT_LOAD_FACTOR, concurrencyLevel);

		int sshift = 0;
		int ssize = 1;
		while (ssize < concurrencyLevel) {
			++sshift;
			ssize <<= 1;
		}
		segmentShift = 32 - sshift;
		segmentMask = ssize - 1;
		accessLogs = new AccessLog[ssize];
		int subCapacity = capacity / ssize;
		if(subCapacity * ssize < capacity) {
			++subCapacity;
		}
		for(int i = 0; i < accessLogs.length; ++i) {
			accessLogs[i] = new AccessLog<K, V>(hashMap, subCapacity);
		}
	}
	public LRUConcurrentHashMap(int capacity) {
		this(capacity, 1);
	}
	public LRUConcurrentHashMap() {
		this(DEFAULT_CAPACITY, 1);
	}

	public V putIfAbsent(K key, V value) {
		Item<K, V> item = new Item<K, V>(key, value);
		Item<K, V> oldItem = hashMap.putIfAbsent(key, item);
		if(oldItem == null) {
			log(item);
			return null;
		} else {
			log(oldItem);
			return oldItem.value;
		}
	}

	public V get(K key) {
		Item<K, V> item = hashMap.get(key);
		if(item == null) {
			return null;
		}
		log(item);
		return item.value;
	}

	protected void log(Item<K, V> item) {
		accessLogFor(hash(item.key)).log(item);
	}

	private AccessLog<K,V> accessLogFor(int hash) {
		return accessLogs[(hash >>> segmentShift) & segmentMask];
	}

	private static int hash(Object x) {
		int h = x.hashCode();
		h += ~(h << 9);
		h ^=  (h >>> 14);
		h +=  (h << 4);
		h ^=  (h >>> 10);
		return h;
	}

	public int size() {
		return hashMap.size();
	}

}
