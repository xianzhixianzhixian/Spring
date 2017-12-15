package com.spring.ba04;

public class ServiceFactory {

	//动态工厂
	public static ISomeService getSomeService(){
		
		return new SomeServiceImpl();
	}
}
