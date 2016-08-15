package com.tu.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
	//获取User类型
	public static void getUser() throws Exception{
		/**1、获取类**/
		//获取类的第一种方法
		Class clz1 = Class.forName("com.tu.test.reflect.User");
		//获取类的第二种方法(java中每个类型都有class属性)
		Class clz2 = User.class;
		//获取类的第三种方法(java中任何一个对象都有getClass()方法)
		User user = new User();
		Class clz3 = user.getClass();
		
		/**2、创建对象**/
		Object userObj = clz1.newInstance();
		
		/**3、获取类的所有属性、方法等信息**/
		Field[] fields = clz1.getDeclaredFields();
		StringBuilder fieldSb = new StringBuilder();
		for (Field field : fields) {
			fieldSb.append(Modifier.toString(field.getModifiers())).append(" ");
			fieldSb.append(field.getType().getName()).append(" ");
			fieldSb.append(field.getName()).append(" ");
			fieldSb.append("\n");
		}
		System.out.println("User类的所有属性信息：" + fieldSb.toString());
		
		Method[] methods = clz1.getDeclaredMethods();
		StringBuilder methodSb = new StringBuilder();
		for (Method method : methods) {
			methodSb.append(Modifier.toString(method.getModifiers())).append(" ");
			methodSb.append(method.getReturnType().getName()).append(" ");
			methodSb.append(method.getName()).append(" ");
			
			Class<?>[] paramClzs = method.getParameterTypes();
			methodSb.append("(");
			for (Class<?> paramClz : paramClzs) {
				methodSb.append(paramClz.getName());
			}
			methodSb.append(method.getParameterTypes()).append(")");
			methodSb.append("\n");
		}
		System.out.println("User类的所有方法信息：" + methodSb.toString());
		
		Constructor[] constructors = clz1.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("构造方法：" + constructor.getName());
		}
		
		/**4、获取特定属性**/
		Field name = clz1.getDeclaredField("name");
		name.setAccessible(true);//反射机制可打破java封装
		name.set(userObj, "wuhoujian");
		System.out.println("My name is : " + name.get(userObj));
	}
	
	public static void main(String[] args) {
		try {
			getUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
