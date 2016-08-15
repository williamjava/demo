package com.tu.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
	//��ȡUser����
	public static void getUser() throws Exception{
		/**1����ȡ��**/
		//��ȡ��ĵ�һ�ַ���
		Class clz1 = Class.forName("com.tu.test.reflect.User");
		//��ȡ��ĵڶ��ַ���(java��ÿ�����Ͷ���class����)
		Class clz2 = User.class;
		//��ȡ��ĵ����ַ���(java���κ�һ��������getClass()����)
		User user = new User();
		Class clz3 = user.getClass();
		
		/**2����������**/
		Object userObj = clz1.newInstance();
		
		/**3����ȡ����������ԡ���������Ϣ**/
		Field[] fields = clz1.getDeclaredFields();
		StringBuilder fieldSb = new StringBuilder();
		for (Field field : fields) {
			fieldSb.append(Modifier.toString(field.getModifiers())).append(" ");
			fieldSb.append(field.getType().getName()).append(" ");
			fieldSb.append(field.getName()).append(" ");
			fieldSb.append("\n");
		}
		System.out.println("User�������������Ϣ��" + fieldSb.toString());
		
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
		System.out.println("User������з�����Ϣ��" + methodSb.toString());
		
		Constructor[] constructors = clz1.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("���췽����" + constructor.getName());
		}
		
		/**4����ȡ�ض�����**/
		Field name = clz1.getDeclaredField("name");
		name.setAccessible(true);//������ƿɴ���java��װ
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
