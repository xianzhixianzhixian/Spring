package com.spring.di04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//与@Componment朱洁功能相同但意义不同的还有三个
//1、@Respository：注解在Dao实现类上
//2、@Service：注解在Service实现类上
//3、@Controller：注解在SpringMVC的处理器上

@Scope(value = "prototype") //默认是singleton
@Component(value = "mySchool")   //组件,表示当前类被Spring容器所管理
public class School {

	@Value(value = "清华大学")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
}
