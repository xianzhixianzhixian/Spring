package com.aop.aop11;

//目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("doFirst()");
	}
	@Override
	public String doSecond() {
		System.out.println("doSecond()");
		return "dosecond";
	}
	@Override
	public void doThird() {
		// TODO Auto-generated method stub
		System.out.println("doThird()");
	}
}
