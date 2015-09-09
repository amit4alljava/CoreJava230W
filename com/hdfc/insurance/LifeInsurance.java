package com.hdfc.insurance;

import com.hdfc.banking.Bank;
//import com.hdfc.banking.Bank;

public class LifeInsurance extends Bank {
public static void main(String[] args) {
	LifeInsurance l = new LifeInsurance();
	l.checkAccountLocked();
	l.checkBalance();
	l.checkNoOfTrans();
}
}
