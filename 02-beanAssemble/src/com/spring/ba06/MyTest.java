/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：订制spring中Bean对象的生命始末(过程)
 */

package com.spring.ba06;

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
		String resource="com/spring/ba06/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		ISomeService service=(ISomeService) applicationContext.getBean("myService");
		service.doSome();
		
		//对于销毁方法的执行有两个条件
		//1、当前Bean是singleton(单例模式)的
		//2、手工关闭容器
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
	
	@After
	public void after(){
		
	}
}
