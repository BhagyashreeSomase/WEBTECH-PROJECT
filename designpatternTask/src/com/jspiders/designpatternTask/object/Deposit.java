package com.jspiders.designpatternTask.object;

public class Deposit {
public double depositAmount;
Account account;
public Deposit(double depositAmount) {
	this.depositAmount = depositAmount;
	this.depositAmount(Account.getaccount());
}
public void depositAmount(Account account) {
	this.account = account;
	Account.accountBalance += depositAmount;
	System.out.println("Depositing"+depositAmount+"\nTotal Account balance is:"+Account.accountBalance);
}
}
