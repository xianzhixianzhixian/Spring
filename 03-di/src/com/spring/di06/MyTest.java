/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：对集合和数组的设值注入,工作中常用方法
 */

package com.spring.di06;

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
		
		//创建容器对象,加载spring配置文件
		String resource="com/spring/di06/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		Some student=(Some) applicationContext.getBean("mySome");
		System.out.println(student);
	}
	
	@After
	public void after(){
		
	}
}
