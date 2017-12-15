package com.spring.ba05;

public class ServiceFactory {

	//动态工厂
	public static ISomeService getSomeService(){
		
		return new SomeServiceImpl();
	}
}
