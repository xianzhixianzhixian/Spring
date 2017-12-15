/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：aop后置通知AfterReturningAdvice,目标方法执行之后执行
 */

package com.aop.aop02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test(){
		String resource="com/aop/aop02/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		//此处应该获取代理
		ISomeService someService=(ISomeService) applicationContext.getBean("serviceProxy");
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
	}
}
