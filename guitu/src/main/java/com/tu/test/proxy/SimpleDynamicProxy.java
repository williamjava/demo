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
		 * ����һ����̬����Proxy.newProxyInstance(����1��ͨ��һ���Ѿ����صĶ����ȡ�������,����2���ô���ʵ�ֵĽӿ��б�,����3����һ�ĵ��ô�����InvocationHandler)
		 * **/
		consumer((Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real)));;
	}
}
