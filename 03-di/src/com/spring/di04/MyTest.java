/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：c命名空间构造注入(调用带参构造函数)
 */

package com.spring.di04;

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
		String resource="com/spring/di04/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		Student student=(Student) applicationContext.getBean("myStudent");
		System.out.println(student);
	}
	
	@After
	public void after(){
		
	}
}
