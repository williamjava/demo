package com.tu.test.reflect;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 9016949872478554542L;

	public User() {
		
	}
	public User(String name,int age,String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	private String name;
	private int age;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
