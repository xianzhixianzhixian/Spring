package com.spring.ba02;

public class ServiceFactory {

	//动态工厂
	public ISomeService getSomeService(){
		
		return new SomeServiceImpl();
	}
}
