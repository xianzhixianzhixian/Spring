/**
 * 作者：樊钰丰
 * 时间：2017.9.7
 * 功能：aop后置通知AfterReturningAdvice,目标方法执行之后执行,使用Cglib动态代理
 * JDKProxy代理的条件是：有接口
 * Cglib代理的条件是：没有接口,但是有接口也可以用Cglib
 */

package com.aop.aop07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test(){
		String resource="com/aop/aop07/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		//此处应该获取代理
		SomeService someService=(SomeService) applicationContext.getBean("serviceProxy");
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
	}
}