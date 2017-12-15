/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：SPEL注入,可以使用表达式,访问别的Bean的属性,使用别的Bean的公有成员函数
 */

package com.spring.di09;

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
		String resource="com/spring/di09/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		
		Person person=(Person) applicationContext.getBean("myPerson");
		System.out.println(person);
		
		Student student=(Student) applicationContext.getBean("myStudent");
		System.out.println(student);
	}
	
	@After
	public void after(){
		
	}
}
