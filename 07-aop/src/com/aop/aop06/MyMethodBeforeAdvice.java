/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：MethodBeforeAdvice实现类,目标方法执行之前执行
 */

package com.aop.aop06;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 前置通知方法,当前方法在目标方法执行之前执行
	 * method：目标方法
	 * args：目标方法的参数列表
	 * target：目标对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub

		//对于目标方法在的增强代码应该写在这里
		System.out.println("执行前置通知方法");
		
		//此段代码相当于执行了目标对象的所有方法
		//method.invoke(target, args);
	}

}
