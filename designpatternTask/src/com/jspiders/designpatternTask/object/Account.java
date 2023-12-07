package com.jspiders.designpatternTask.object;

public class Account {
public static double accountBalance;
static Account account;
public Account(double accountBalance) {
	this.accountBalance=accountBalance;
}
public static Account getaccount() {
	if(account==null) {
		account=new Account(10000);
	}
	return account;
}
}
