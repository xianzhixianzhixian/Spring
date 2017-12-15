package com.spring.di04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "myStudent")   //组件,表示当前类被Spring容器所管理
public class Student {

	@Value(value = "麻六")
	private String name;
	@Value(value = "26")
	private int age;
	
	@PostConstruct
	public void initAfter(){
		
		System.out.println("当前Bean初始化刚完毕");
	}
	
	@PreDestroy
	public void preDestory(){
		
		System.out.println("当前Bean即将被销毁");
	}

	//@Resource(name = "mySchool")   //byName方式
	@Resource   //byType方式
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
