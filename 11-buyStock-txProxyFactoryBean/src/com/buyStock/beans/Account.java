/**
 * 作者：樊钰丰
 * 时间：2017.9.11
 * 功能：银行账户实体类
 */

package com.buyStock.beans;

public class Account {

	private Integer aid;
	private String aname;
	private double balance; //账户余额
	
	public Account() {
		super();
	}

	public Account(Integer aid, String aname, double balance) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", balance=" + balance + "]";
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
