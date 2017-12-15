/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：使用Spring的JUnit4测试
 */

package com.spring.di06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//一定要指明是类路径,否则会出错
@ContextConfiguration(locations = {"classpath:com/spring/di06/applicationContext.xml"} )
public class MyTest {
	
	@Autowired
	private Student student;
	@Autowired
	private School school;
	
	@Test
	public void test(){
		
		System.out.println(student);
		System.out.println(school);
	}
}
