/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：MethodBeforeAdvice实现类,目标方法执行之前之后都执行
 */

package com.aop.aop03;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyMethodInterceptor implements MethodInterceptor {

	/**
	 * 环绕通知,目标方法执行之前之后都执行
	 * 可修改目标方法的返回值
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行环绕通知：目标方法执行之前");
		
		//执行目标方法
		Object result=invocation.proceed();
		
		System.out.println("执行环绕通知：目标方法执行之后");
		
		if(result!=null){
			result=result.toString().toUpperCase();
		}
		//返回了目标方法的执行结果
		return result;
	}
}
