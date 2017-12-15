/**
 * 作者：樊钰丰
 * 时间：2017.9.6
 * 功能：aop编程引入,传统代码存在的问题
 * 使用JavaProxy代理方式解决该问题
 */

package com.aop.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.aop.service.*;
import com.aop.utils.SystemService;

public class MyTest {
	
	public static void main(String[] args) {
		ISomeService target=new SomeServiceImpl();
		ISomeService someService=
				(ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader()
								, target.getClass().getInterfaces()
								, new InvocationHandler(){
					
									@Override//织入weaving
									public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
										// TODO Auto-generated method stub
										SystemService.doTx(); //切面
										//执行目标方法
										Object result=method.invoke(target, args); //主业务逻辑
										SystemService.doLog(); //切面
										return result;
									}
					
								});
		someService.doFirst();
		System.out.println("==============================");
		someService.doSecond();
	}
}
