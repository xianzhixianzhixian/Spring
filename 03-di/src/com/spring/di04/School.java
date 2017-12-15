package com.spring.di04;

public class School {

	private String name;

	public School(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
}
