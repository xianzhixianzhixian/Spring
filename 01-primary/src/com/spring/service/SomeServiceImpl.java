package com.spring.service;

public class SomeServiceImpl implements ISomeService {
	
	//一个没有成员变量的对象在堆内存中占8个字节
	//SomeServiceImpl在堆内存中有8(SomeServiceImpl)+4(int)=12个字节
	private int a=5;
	
	//动态代码块,先于无参构造函数执行
	{
		System.out.println("执行动态代码块 a="+a);
	}
	
	public SomeServiceImpl(){
		
		System.out.println("创建对象a="+a);
	}
	
	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行doSome()方法");
	}

}
