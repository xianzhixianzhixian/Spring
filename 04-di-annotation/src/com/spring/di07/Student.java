package com.spring.di07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "myStudent")   //组件,表示当前类被Spring容器所管理
public class Student {

	@Value(value = "麻六")
	private String name;
	@Value(value = "26")
	private int age;
	
	@Autowired   //byType方式的注解式注入
	private School school; //域对象,域属性

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
