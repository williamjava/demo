package com.tu.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;//要被代理的对象
	
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("proxy:" + proxy.getClass() + ",method:" + method + ",args:" + args);
		if (args != null) {
			for (Object arg : args) {
				System.out.println(" " + arg);
			}
		}
		//执行method.invoke方法之前可以进行方法的过滤，判断method.getName()
		return method.invoke(proxied, args);
	}
}
