package com.jspiders.designpatternTask.main;

import java.util.Scanner;

import com.jspiders.designpatternTask.object.Account;
import com.jspiders.designpatternTask.object.CheckBalance;
import com.jspiders.designpatternTask.object.Deposit;
import com.jspiders.designpatternTask.object.Wthdraw;

public class AccountTransactionMain {
public static void main(String[]args) {
	Account account=new Account(10000);
	boolean loop=true;
	while(loop) {
		System.out.println("*****Transaction*****\n"+"1 :Deposit\n"+"2:Withdraw\n"+"3 :CheckBalance\n"+"4 :Exit");
		System.out.println("Choose the transaction");
		Scanner scanner=new Scanner(System.in);
		int choose=scanner.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Please Enter the Amount");
			double deposit=scanner.nextDouble();
			Deposit depositAmt=new Deposit(deposit);
			System.out.println("Amount :"+ depositAmt.depositAmount+ "is Deposited sucessfully");
			break;
		case 2:
			System.out.println("Please Enter the Amount");
			double withdraw=scanner.nextDouble();
			Wthdraw withdrawAmt=new Wthdraw(withdraw);
			if(withdraw <=Account.accountBalance) {
			System.out.println("Amount :"+withdrawAmt.withdrawAmount+"is withdrawn sucessfully" );
		}
		else
			System.out.println("withdraw is unsucessfully");
		break;
		case 3:
			System.out.println("Current Balance is:");
			CheckBalance checkBal=new CheckBalance();
			break;
		case 4:
			System.out.println("====Thank You====");
			loop=false;
			break;
			default:
				System.out.println("Invalid Choice!!!!!");
				break;
	}
}
}
}
	
