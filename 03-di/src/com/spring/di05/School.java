package com.spring.di05;

import java.util.Set;

public class School {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}

}
