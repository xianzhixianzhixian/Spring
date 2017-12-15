/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：spring静态工厂Bean的两种模式(单例模式和原型模式)
 */

package com.spring.ba04;

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
		
		String resource="com/spring/ba04/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		ISomeService service=(ISomeService) applicationContext.getBean("myService");
		ISomeService service2=(ISomeService) applicationContext.getBean("myService");
		System.out.println("service==service2 "+(service==service2));
	}
	
	@After
	public void after(){
		
	}
}
