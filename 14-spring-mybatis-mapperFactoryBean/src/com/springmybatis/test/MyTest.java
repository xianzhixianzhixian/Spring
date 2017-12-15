/**
 * 作者：樊钰丰
 * 时间：2017.9.12
 * 功能：Mapper动态代理方式生成Dao代理对象
 */

package com.springmybatis.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmybatis.beans.Student;
import com.springmybatis.service.IStudentService;

public class MyTest {
	
	private IStudentService studentService;

	@Before
	public void before(){
		
		String resource="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
		studentService = (IStudentService) applicationContext.getBean("studentService");
	}

	@Test
	public void insert(){
		
		Student student=new Student("顺平",50);
		studentService.addStudent(student);
	}
	
	@Test
	public void update(){

		Student student=new Student("进平",50);
		student.setId(14);
		studentService.modifyStudent(student);
	}
	
	@Test
	public void delete(){
		
		studentService.removeById(10);
	}
	
	@Test
	public void select(){
		
		//查询所有学生信息
		List<Student> students=studentService.findAllStudents();
		for(Student student : students)
		System.out.println(student);
		
		//查询某个学生的信息
		Student student=studentService.findStudentById(14);
		System.out.println(student);
	}
	
	@After
	public void after(){
		
	}
}
