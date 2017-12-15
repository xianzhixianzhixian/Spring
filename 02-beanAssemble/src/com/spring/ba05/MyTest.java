/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：spring中Bean后处理器的作用
 */

package com.spring.ba05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {
	
	@Before
	public void before(){
		
	}
	
	@Test
	public void test(){
		
		String resource="com/spring/ba05/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		ISomeService service=(ISomeService) applicationContext.getBean("myService");
		System.out.println(service.doSome());
		System.out.println(service.doOther());
		
		System.out.println("只增强myService,不增强myService2");
		
		ISomeService service2=(ISomeService) applicationContext.getBean("myService2");
		System.out.println(service2.doSome());
		System.out.println(service2.doOther());
	}
	
	@After
	public void after(){
		
	}
}
