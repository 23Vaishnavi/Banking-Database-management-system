package com;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("welecome to SBI bank");
Scanner sacn=new Scanner(System.in);
Bank bank=new BankImpl(5000);
while(true) {
System.out.println("1:Deposit Amount\n2:Withdraw Amount \n3:checkbalancen\n4:Exit\nEnter choice");
int choice=sacn.nextInt();
switch(choice) {
case 1:
	System.out.println("Depositing amount");
	int amountToDeposit=sacn.nextInt();
	bank.deposit(amountToDeposit);//bank.deposit(sacn.nextInt());
	break;
case 2: 
	System.out.println("withdrawing Amount");
	int amountTowithdrawn=sacn.nextInt();
	bank.withdraw(amountTowithdrawn);//bank.withdraw(sacn.nextInt());
	break;
case 3:
	System.out.println("checking balance");
	 System.out.println ("available balance"+bank.checkbalance());
	 break;                              
case 4:
	System.out.println("thank you");
	System.exit(0);
	default:
		System.out.println("innvalid choice");
		
		
}	
		
	
	
}

}
}
