package com.aop.aop05;

//目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public boolean login(String username, String password) throws UserException {
		// TODO Auto-generated method stub
		if(!"root".equals(username)){
			throw new UsernameException("用户名异常");
		}
		if(!"123456".equals(password)){
			throw new PasswordException("密码异常");
		}
		
		//double a=3/0;
		
		return true;
	}
}
