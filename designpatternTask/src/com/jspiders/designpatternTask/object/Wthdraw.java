package com.jspiders.designpatternTask.object;

public class Wthdraw {
public double withdrawAmount;
Account account;
public  Wthdraw(double withdrawAmount) {
	this.withdrawAmount=withdrawAmount;
	this.withdrawAmount(Account.getaccount());
}
private void withdrawAmount(Account getaccount) {
this.account=account;
if(withdrawAmount <=Account.accountBalance) {
	Account.accountBalance-=withdrawAmount;
	System.out.println("Withdrawn amount is:"+withdrawAmount+"\nTotal Account balance is :"+Account.accountBalance);
}else {
	System.out.println("Insufficient Balance");
}
}
}
