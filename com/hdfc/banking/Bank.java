package com.hdfc.banking;

public class Bank {
	public void withDraw(){
		checkPin();
		checkAccountLocked();
		checkNoOfTrans();
		checkBalance();
	}
	
	protected void checkNoOfTrans(){
		
	}
	
	protected void checkAccountLocked(){
		
	}
	
	protected void checkBalance(){
		
	}
	
	protected void checkPin(){
		
	}


}
