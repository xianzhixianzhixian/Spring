package com.aop.service;

import com.aop.utils.SystemService;

//目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("doFirst()");
	}
	@Override
	public void doSecond() {
		System.out.println("doSecond()");
	}
}
