package com.tu.test;

public abstract class AbstractTime {
	public abstract void template();//抽象方法，子类去实现
	
	public final void getTime() {//不需要重新，添加final关键字修饰
		long start = System.currentTimeMillis();
		template();
		long end = System.currentTimeMillis();
		System.out.println("总耗时为：" + (end - start));
	}
}
