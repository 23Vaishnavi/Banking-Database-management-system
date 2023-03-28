package com;

public class InsufficientBalanceException extends RuntimeException {
private String message;
InsufficientBalanceException(String messege){
	this.message=messege;
}
	
@Override
public String getMessage() {
	return message;
}
	

}
/** Documention comment-> Rules to develop custome exeception
*-------------------------------------------------------
* 1.create a class with the execption name.abstract
* 2a.if class extends exeception-> checked exeception.abstract
* 2b. if class exdents runtime exception->un checked exception
* 3.override get messege()->(variables ,constructor, method)
* 4.invok the exeception object using throw keyword &handele it using try and catch block
*/