/**
 * 作者：樊钰丰
 * 时间：2017.9.4
 * 功能：spring第一个程序
 */

package com.spring.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.service.ISomeService;
import com.spring.service.SomeServiceImpl;

public class MyTest {
	
	@Before
	public void before(){
		
	}
	
	//这两个容器对于其中Bean的创建时机不一样
	//ApplicationContext容器中的对象在进行初始化时会将其中的所有Bean(对象)进行创建
	//BeanFactory容器中的对象在容器初始化时并不会被创建,而是在真正获取该对象时才被创建
	
	@Test
	public void test(){
		
//		ISomeService service=new SomeServiceImpl();
//		service.doSome();
		
		//创建容器对象,加载spring配置文件
		//FileSystemXmlApplicationContext是在当前项目的根目录下去找xml文件,当前是 01-primary
		//ClassPathXmlApplicationContext是在类路径查找xml文件
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService service=(ISomeService) applicationContext.getBean("myService");
		service.doSome();
	}
	
	@Test
	public void test1(){
		
		//创建BeanFactory容器
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service=(ISomeService) beanFactory.getBean("myService");
		service.doSome();
	}
	
	@After
	public void after(){
		
	}
}
