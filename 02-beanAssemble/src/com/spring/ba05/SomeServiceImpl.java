package com.spring.ba05;

public class SomeServiceImpl implements ISomeService {
	
	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行doSome()方法");
		return "dosome";
	}

	@Override
	public String doOther() {
		// TODO Auto-generated method stub
		return "doother";
	}

}
