package com.sergio.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.sergio.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(this.getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(this.getClass() + ": doWork()");
		return false;
	}
	
}
