package com.aop.aop07;

//目标类
public class SomeService {

	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("doFirst()");
	}
	
	public String doSecond() {
		System.out.println("doSecond()");
		return "dosecond";
	}
}
