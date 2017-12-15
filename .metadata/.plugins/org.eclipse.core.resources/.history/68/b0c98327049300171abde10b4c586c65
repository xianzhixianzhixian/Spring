package com.aop.service;

import com.aop.utils.SystemService;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		SystemService.doTx();
		System.out.println("doFirst()");
		SystemService.doLog();
	}
	@Override
	public void doSecond() {
		SystemService.doTx();
		System.out.println("doSecond()");
		SystemService.doLog();
	}
}
