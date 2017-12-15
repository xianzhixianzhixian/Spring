/**
 * 作者：樊钰丰
 * 时间：2017.9.5
 * 功能：BeanPostProcessor的使用
 */

package com.spring.ba05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * Object bean：表示当前正在进行初始化的Bean对象
	 * String beanName：表示当前正在进行初始化的Bean对象的id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("执行 postProcessBeforeInitialization 方法");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("执行 postProcessAfterInitialization 方法");
		
		Object obj;
		if ("myService".equals(beanName)) {
			obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
					new InvocationHandler() {

						/**
						 * 匿名内部类
						 */
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							
							Object invoke=method.invoke(bean, args);;
							if ("doSome".equals(method.getName())) {
								// TODO Auto-generated method stub
								
								return ((String) invoke).toUpperCase();
							}
							return invoke;
						}

					});
			return obj;
		}
		
		return bean;
	}

	
}
