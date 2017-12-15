/**
 * 作者：樊钰丰
 * 时间：2017.9.7
 * 功能：aop顾问,默认Advisor自动代理生成器
 * 
 * 第一种自动代理生成器的使用
 * org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator
 * 
 * 存在的问题
 * 1、不能选择目标对象
 * 2、不能选择切面类型,切面只能是advisor
 * 3、不呢不管选择advisor,所有advisor均将被作为切面织入到目标方法
 */

package com.aop.aop11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test(){
		String resource="com/aop/aop11/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		//此处应该获取代理
		ISomeService someService=(ISomeService) applicationContext.getBean("someService");
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
		System.out.println("==============================");
		someService.doThird();
		
		System.out.println("------------------------------");
		ISomeService someService2=(ISomeService) applicationContext.getBean("someService2");
		someService2.doFirst();
		System.out.println("==============================");
		someService2.doSecond();
		System.out.println("==============================");
		someService2.doThird();
	}
}
