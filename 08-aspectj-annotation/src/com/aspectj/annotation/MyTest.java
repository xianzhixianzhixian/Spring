/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：AspectJ基于注解的aop的实现
 */

package com.aspectj.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test(){
		String resource="com/aspectj/annotation/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		ISomeService someService=(ISomeService) applicationContext.getBean("someService");
		someService.doFirst();
		System.out.println("---------------------------");
		System.out.println(someService.doSecond());
		System.out.println("---------------------------");
		someService.doThird();
	}
}
