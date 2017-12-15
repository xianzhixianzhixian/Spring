package com.spring.di09;

public class Person {

	private String pname;
	private int page;
	
	public int computeAge(){
		
		return page > 25 ? 25 : page;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", page=" + page + "]";
	}
}
