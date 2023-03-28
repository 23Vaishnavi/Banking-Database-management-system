 package com;

public class BankImpl implements Bank{
	//int balance=1000;it is hard coding
	int balance;
	BankImpl(int balance) {
		this.balance=balance;
	}
	@Override
	public 	void deposit( int amount) {
	System.out.println("Depositing Rs"+amount);	
	balance=balance+amount;//balance+=amount;
	System.out.println("Amount deposited sucessfully");		
		
	}
@Override
public void withdraw(int amount) {
	if(amount<=balance) {
System.out.println("withdraw Rs"+amount);	
balance-=amount;//balance=balance-amount	
	
System.out.println("amount withdraw sucessfully");	
	
}
else{
	try {
		throw new InsufficientBalanceException("insuffient amount");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
	
	@Override
	public int checkbalance() {
		return balance;
	}
	
	
	
	
	
}
