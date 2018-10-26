package com.taobao.tddl.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.taobao.config.client.Subscriber;
import com.taobao.config.client.SubscriberDataObserver;
import com.taobao.config.client.SubscriberRegistration;
import com.taobao.config.client.Subscription;

/**
 * 类说明:对UniqueSubscriber简单的包装，支持同一ip,相同DataId只会有一个订阅者的实例
 * 使用时要用UniqueSubscriberRegistrar的register方法进行注册
 *
 * @author 齐昊 E-mail:qihao@taobao.com
 * @version $Id 创建时间：2009-7-7 下午02:48:18 UniqueSubscriber.java
 */
public class UniqueSubscriber implements Subscriber {

	private static final Logger log = Logger.getLogger(UniqueSubscriber.class);
	/**
	 * configClient真实订阅者
	 */
	private volatile Subscriber subscriber;

	/**
	 * Observer的list列表
	 */
	private List<SubscriberDataObserver> observerList = new ArrayList<SubscriberDataObserver>();

	public void setDataObserver(SubscriberDataObserver observer) {
		// 将observer添加到List<SubscriberDataObserver>中
		synchronized (observerList) {
			observerList.add(observer);
			if (null != subscriber) {
				List<Object> data = subscriber.peekData();
				if (null != data) {
					// 立即响应一次handleData
					observer.handleData(subscriber.getDataId(), data);
				}
			}
		}
	}

	/**
	 * @param subscriber
	 *            the subscriber to set
	 */
	protected void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
		this.subscriber.setDataObserver(new SubscriberDataObserver() {
			public void handleData(String dataId, List<Object> data) {
				// 将得到的数据覆盖，lastData
				synchronized (observerList) {
					for (SubscriberDataObserver sdo : observerList) {
						if (null != sdo) {
							try {
								sdo.handleData(dataId, data);
							} catch (Exception e) {
								log.error("UniqueSubscriber.handleData Exception", e);
							}
						}
					}
				}
			}
		});
	}

	/**
	 * @param subscriber
	 *            the subscriber to set
	 */
	public SubscriberDataObserver getDataObserver() {
		throw new UnsupportedOperationException("UniqueSubscriber not Support getDataObserver method !");
	}

	public SubscriberRegistration getRegistration() {
		return subscriber.getRegistration();
	}

	public Subscription getSubscription() {
		return subscriber.getSubscription();
	}

	public List<Object> peekData() {
		return subscriber.peekData();
	}

	public String getDataId() {
		return subscriber.getDataId();
	}

	public String getClientId() {
		return subscriber.getClientId();
	}

	/**
	 * @return the subscriber
	 */
	public Subscriber getSubscriber() {
		return subscriber;
	}
}
