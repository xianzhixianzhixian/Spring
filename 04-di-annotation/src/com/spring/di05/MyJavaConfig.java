/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：充当Spring容器,即所有的Bean将由该类来创建
 */

package com.spring.di05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //表示当前类充当Spring容器,即所有的Bean将由该类来创建
public class MyJavaConfig {

	//@Bean(name="mySchool")   //byType时可取任意名字
	@Bean(name="school")   //byName时只能与域属性同名
	public School mySchoolCreator(){
		
		return new School("北京大学");
	}
	
//	//autowire=Autowire.BY_TYPE指从当前类容器中查找与域属性类型具有is-a关系的Bean
//	@Bean(name="myStudent",autowire=Autowire.BY_TYPE)
//	public Student myStudentCreator(){
//		
//		return new Student("麻六",26);
//	}
	
	//autowire=Autowire.BY_NAME指从当前类容器中查找与域属性同名的Bean
	@Bean(name="myStudent",autowire=Autowire.BY_NAME)
	public Student myStudentCreator(){
		
		return new Student("麻六",26);
	}
}
