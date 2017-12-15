/**
 * 作者：樊钰丰
 * 时间：2017.9.7
 * 功能：自定义异常
 */

package com.aop.aop05;

//异常分为两种
//1、运行时异常(不进行处理也可以通过编译)
//2、编译时异常,受查异常,Checked Exception(不行进行处理无法通过编译)

//若一个类继承自RuntimeException则该异常就是运行时异常
//若一个类继承自Exception,则该异常就是受查异常
public class UserException extends Exception {

	public UserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
