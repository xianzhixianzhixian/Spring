/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：aop编程引入,传统代码存在的问题
 */

package com.aop.test;

import com.aop.service.*;

public class MyTest {
	
	public static void main(String[] args) {
		ISomeService someService=new SomeServiceImpl();
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
	}
}
