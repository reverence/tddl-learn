package com.taobao.tddl.client;



/**
 * 通用接口，可以通过重写{@link RouteHandler} 并且注册到{@link RouteHandlerRegister}
 * 上的方式来加载新的自定义conditionHandler.这样就可以支持多种不同的条件以及处理。 {@link RouteHandlerRegister}
 * 中的key为RouteCondition实现的class全名称。
 *
 *
 * @author shenxun
 *
 */
public interface RouteCondition {
	public String getVirtualTableName() ;

}
