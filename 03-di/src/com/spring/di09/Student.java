package com.spring.di09;

public class Student {

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
		System.out.println("执行setName()");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("执行setAge()");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
