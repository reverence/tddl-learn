package com.taobao.tddl.common.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

public class SpringXmlConfigParser<T> implements TddlConfigParser<T> {

	/*private String beanId;
	public SpringXmlConfigParser(String beanId){
		this.beanId = beanId;
	}*/

	@SuppressWarnings("unchecked")
	public T parseCongfig(String txt) {
		//用String Resource类从txt初始化context
		StringXmlApplicationContext ctx = new StringXmlApplicationContext(txt);
		//Type  type = this.getClass().getGenericSuperclass();
		//System.out.println(type.getClass().getName());
		/*T a = null;
		class Temp extends SpringXmlConfigParser<T>{

		}
		Temp t = new Temp();
		t.get*/
		//ctx.getBeanNamesForType(a.getClass());
		//TODO 解决泛型擦除问题，用T的短类名替代"root"
		return (T)ctx.getBean("root");
	}

	private class StringXmlApplicationContext extends AbstractXmlApplicationContext {
		private Resource[] configResources;

		public StringXmlApplicationContext(String stringXml) {
			this(stringXml, null);
		}

		public StringXmlApplicationContext(String stringXml, ApplicationContext parent) {
			super(parent);
			this.configResources = new Resource[1];
			this.configResources[0] = new ByteArrayResource(stringXml.getBytes());
			refresh();
		}

		protected Resource[] getConfigResources() {
			return this.configResources;
		}
	}
}
