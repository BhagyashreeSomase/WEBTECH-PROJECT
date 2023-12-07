package com.jspiders.designpatternTask.object;

public class CheckBalance {
double checkBalance;
Account account;
public CheckBalance() {
	this.checkBalance(Account.getaccount());
}
public double checkBalance(Account getaccount) {
	this.account = account;
	System.out.println(Account.accountBalance);
	return Account.accountBalance;
	
}
}
