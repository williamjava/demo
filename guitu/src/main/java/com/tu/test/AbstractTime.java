package com.tu.test;

public abstract class AbstractTime {
	public abstract void template();//���󷽷�������ȥʵ��
	
	public final void getTime() {//����Ҫ���£����final�ؼ�������
		long start = System.currentTimeMillis();
		template();
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱΪ��" + (end - start));
	}
}
