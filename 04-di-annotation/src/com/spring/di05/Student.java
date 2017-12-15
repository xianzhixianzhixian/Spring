package com.spring.di05;

public class Student {

	private String name;
	private int age;
	private School school;

	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("执行setName()");
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("执行setAge()");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
}
