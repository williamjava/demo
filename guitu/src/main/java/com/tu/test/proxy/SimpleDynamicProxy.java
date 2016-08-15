package com.tu.test.proxy;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("proxy");
	}
	
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		
		//insert a proxy and call method again
		/**
		 * 创建一个动态代理：Proxy.newProxyInstance(参数1：通过一个已经加载的对象获取类加载器,参数2：该代理实现的接口列表,参数3：单一的调用处理器InvocationHandler)
		 * **/
		consumer((Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real)));;
	}
}
