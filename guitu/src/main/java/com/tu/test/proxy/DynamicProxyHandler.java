package com.tu.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;//Ҫ������Ķ���
	
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
		//ִ��method.invoke����֮ǰ���Խ��з����Ĺ��ˣ��ж�method.getName()
		return method.invoke(proxied, args);
	}
}
