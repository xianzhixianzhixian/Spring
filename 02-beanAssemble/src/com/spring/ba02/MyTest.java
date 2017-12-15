/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：spring中动态工厂Bean
 */

package com.spring.ba02;

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
		
		String resource="com/spring/ba02/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		ISomeService service=(ISomeService) applicationContext.getBean("myService");
		service.doSome();
	}
	
	@After
	public void after(){
		
	}
}
