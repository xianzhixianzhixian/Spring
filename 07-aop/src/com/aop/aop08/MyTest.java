/**
 * 作者：樊钰丰
 * 时间：2017.9.7
 * 功能：aop后置通知AfterReturningAdvice,目标方法执行之后执行
 * 有接口的时候使用Cglib
 */

package com.aop.aop08;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test(){
		String resource="com/aop/aop08/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		//此处应该获取代理
		ISomeService someService=(ISomeService) applicationContext.getBean("serviceProxy");
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
	}
}
