package com.taobao.tddl.common;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.alibaba.common.lang.StringUtil;
import com.taobao.config.client.Subscriber;
import com.taobao.config.client.SubscriberRegistrar;
import com.taobao.config.client.SubscriberRegistration;
import com.taobao.config.client.Subscription;

/**
 * 类说明:对SubscriberRegistrar简单的包装，对相同IP的相同订阅会合并成一个 注册后返回的对象是UniqueSubscriber
 *
 * @author 齐昊 E-mail:qihao@taobao.com
 * @version $Id 创建时间：2009-7-7 下午03:34:57 UniqueSubscriberRegistrar.java
 */
public class UniqueSubscriberRegistrar {

	private static final Logger log = Logger.getLogger(UniqueSubscriberRegistrar.class);
	/**
	 * 带组信息的UniqueSubscriber的map,其中Map<groupName, Map<dataId, UniqueSubscriber>>
	 */
	private static Map<String, Map<String, UniqueSubscriber>> GROUP_SUBSCRIBER_MAP = new ConcurrentHashMap<String, Map<String, UniqueSubscriber>>();

	/**
	 * 不带组信息的UniqueSubscriber的map,其中Map<dataId, UniqueSubscriber>
	 */
	private static Map<String, UniqueSubscriber> SUBSCRIBER_MAP = new ConcurrentHashMap<String, UniqueSubscriber>();

	/**
	 * 默认注册等待时间
	 */
	private static final int DEFALUT_WAIT_TIME = 30000;

	/**
	 * SubscriberRegistration 反射出的setCacheMethod 主要为了兼容1.2没有 setCacheMethod
	 * 方法，所以使用反射调用
	 */
	private static Method setCacheMethod = null;

	static {
		try {
			setCacheMethod = SubscriberRegistration.class.getMethod("setCacheable", boolean.class);
		} catch (NoSuchMethodException e) {
			log.warn("configClient SubscriberRegistration no setCacheableMethod!");
		}
	}

	/**
	 * 根据dataId得到UniqueSubscriber 一定要再调用UniqueSubscriberRegistrar
	 * 的register系列方法后使用， 使用时请判断UniqueSubscriber 是否为null
	 *
	 * @param dataId
	 * @return
	 */
	public static UniqueSubscriber getUniqueSubscriber(String dataId) {
		UniqueSubscriber uniqueSubscriber = null;
		if (StringUtil.isBlank(dataId)) {
			log.error("UniqueSubscriberRegistrar getUniqueSubscriber error: dataId is empty");
		} else {
			uniqueSubscriber = UniqueSubscriberRegistrar.SUBSCRIBER_MAP.get(dataId);
		}
		return uniqueSubscriber;
	}

	/**
	 * 根据dataId和groupName得到UniqueSubscriber 一定要再调用UniqueSubscriberRegistrar
	 * 的register系列方法后使用， 使用时请判断UniqueSubscriber 是否为null
	 *
	 * @param dataId
	 * @param groupName
	 * @return
	 */
	public static UniqueSubscriber getUniqueSubscriber(String dataId, String groupName) {
		UniqueSubscriber uniqueSubscriber = null;
		if (StringUtil.isBlank(dataId) || null == groupName) {
			log.error("UniqueSubscriberRegistrar getUniqueSubscriber error: dataId or groupName is empty");
		} else {
			Map<String, UniqueSubscriber> map = UniqueSubscriberRegistrar.GROUP_SUBSCRIBER_MAP.get(groupName);
			if (null != map && !map.isEmpty()) {
				uniqueSubscriber = map.get(dataId);
			}
		}
		return uniqueSubscriber;
	}

	/**
	 * 根据dataId创建一个SubscriberRegistration
	 *
	 * @param dataId
	 * @return
	 */
	public static SubscriberRegistration createSubscriberRegistration(String subscriberName, String dataId) {
		return new SubscriberRegistration(subscriberName, dataId);
	}

	/**注册一个Subscriber,根据waitTime的值进行等待,并且可以指定注册的时候没有数据是否退出。
	 * 同一个IP相同DataId,group,Subscriber会进行合并，只有一个
	 * @param registration
	 * @param waitTime 注册等待时间
	 * @param useCache 是否使用缓存
	 * @param noDataExit 注册时没数据是否退出
	 * @return
	 */

	public synchronized static UniqueSubscriber register(SubscriberRegistration registration, int waitTime, boolean useCache,boolean noDataExit) {
		UniqueSubscriber uniqueSubscriber = null;
		if (null == registration) {
			log.error("UniqueSubscriberRegistrar register registration is null ");
			return uniqueSubscriber;
		}
		String dataId = registration.getDataId();
		String groupName = registration.getGroup();
		Map<String, UniqueSubscriber> subscriberMap = SUBSCRIBER_MAP;
		if (null != groupName) {
			subscriberMap = GROUP_SUBSCRIBER_MAP.get(groupName);
			// 如果空，创建一个空的分组MAP
			if (null == subscriberMap) {
				subscriberMap = new ConcurrentHashMap<String, UniqueSubscriber>();
				GROUP_SUBSCRIBER_MAP.put(groupName, subscriberMap);
			}
		}
		uniqueSubscriber = subscriberMap.get(dataId);
		if (null == uniqueSubscriber) {
			uniqueSubscriber = doRegister(registration, waitTime, useCache,noDataExit);
			subscriberMap.put(dataId, uniqueSubscriber);
		}
		return uniqueSubscriber;
	}

	/**注册一个Subscriber,根据waitTime的值进行等待,如果注册没有数据则会退出。
	 * 同一个IP相同DataId,group,Subscriber会进行合并，只有一个
	 * @param registration
	 * @param waitTime
	 * @param useCache
	 * @return
	 */
	public synchronized static UniqueSubscriber register(SubscriberRegistration registration, int waitTime, boolean useCache){
		return UniqueSubscriberRegistrar.register(registration, waitTime, useCache, true);
	}

	public synchronized static void cleanAllSubscriber() {
		int subscriberSize = SUBSCRIBER_MAP.size() + GROUP_SUBSCRIBER_MAP.size();
		SUBSCRIBER_MAP.clear();
		GROUP_SUBSCRIBER_MAP.clear();
		log.warn("[clean Subscriber] clean count: " + subscriberSize);
	}

	/**
	 * @param registration
	 * @param deathWait
	 * @return
	 */
	private static UniqueSubscriber doRegister(SubscriberRegistration registration, int waitTime, boolean useCache,boolean noDataExit) {
		UniqueSubscriber uniqueSubscriber = new UniqueSubscriber();
		if (!useCache) {
			setNoCache(registration);
		}
		Subscriber subscriber = SubscriberRegistrar.register(registration);
		// 如果注册成功打印日志
		if (null != subscriber) {
			Subscription subscription = subscriber.getSubscription();
			subScriptionWait(waitTime, subscription, registration.getDataId(), useCache,noDataExit);
			uniqueSubscriber.setSubscriber(subscriber);
			StringBuilder sb = new StringBuilder();
			sb.append("[Series] Register Succeed DataId: ");
			sb.append(registration.getDataId());
			sb.append(" GroupName: ");
			sb.append(StringUtil.defaultIfNull(registration.getGroup(), "DEFAULT_GROUP"));
			log.warn(sb.toString());
		}
		return uniqueSubscriber;
	}

	/**
	 * @param registration
	 */
	private static void setNoCache(SubscriberRegistration registration) {
		try {
			if (null != setCacheMethod) {
				setCacheMethod.invoke(registration, Boolean.FALSE);
			}
		} catch (Exception e) {
			log.error("doRegister invoke setCacheableMethod Error : ", e);
		}
	}

	/**
	 * @param waitTime
	 * @param isUseCache
	 * @param subscription
	 */
	private static void subScriptionWait(int waitTime, Subscription subscription, String dataId, boolean useCache,boolean noDataExit) {
		// 有缓存的等待
		if (useCache || setCacheMethod == null) {
			// 等待1ms如果缓存有直接返回
			List<Object> firstData = null;
			List<Object> secondData = null;
			try {
				firstData = subscription.waitNext(1);
			} catch (Exception e) {
				log.error("UniqueSubscriberRegistrar register waitNext(1) Error: ", e);
			}
			// 如果上次没拿到数据，再等真正开始等待
			long defaultTimeOut = waitTime >= 0 ? waitTime : DEFALUT_WAIT_TIME;
			try {
				secondData = subscription.waitNext(defaultTimeOut);
			} catch (Exception e) {
				log.error("UniqueSubscriberRegistrar register waitNext(" + waitTime + ") Error: ", e);
			}
			if (null == secondData) {
				checkWaitData(dataId, firstData, defaultTimeOut,noDataExit);
			}
		} else {
			// 无缓存等待
			List<Object> readData = null;
			try {
				if (waitTime >= 0) {
					readData = subscription.waitNext(waitTime);
					checkWaitData(dataId, readData, waitTime,noDataExit);
				} else {
					subscription.waitNext();
				}
			} catch (Exception e) {
				log.error("UniqueSubscriberRegistrar register waitNext() Error: ", e);
			}
		}
	}

	/**
	 * @param dataId
	 * @param firstData
	 */
	private static void checkWaitData(String dataId, List<Object> firstData, long waitTime,boolean noDataExit) {
		if (null != firstData) {
			log.warn("[MebeyUserCache] dataId: " + dataId);
		} else {
			if(noDataExit){
				log.error("[ReadTimeOut] System Exit! timeOut: " + waitTime + "ms dataId: " + dataId);
				System.exit(0);
			}else{
				log.warn("[ReadData] is Empty ! cost: " + waitTime + "ms dataId: " + dataId);
			}
		}
	}
}