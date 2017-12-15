package com.spring.ba06;

public class SomeServiceImpl implements ISomeService {

	//默认装配方式：调用无参构造函数	
	public SomeServiceImpl(){
		
		System.out.println("执行无参构造函数");
	}
	
	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行doSome()方法");
	}

	public void setUp(){
		
		System.out.println("Bean生命开始");
	}
	
	public void tearDown(){

		System.out.println("Bean销毁之前");
	}
}
