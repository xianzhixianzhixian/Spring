/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：BeanPostProcessor的使用
 */

package com.spring.ba07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * Object bean：表示当前正在进行初始化的Bean对象,初始化完毕之前
	 * String beanName：表示当前正在进行初始化的Bean对象的id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Step5：执行 postProcessBeforeInitialization 方法");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Step8：执行 postProcessAfterInitialization 方法");
		return bean;
	}

	
}
