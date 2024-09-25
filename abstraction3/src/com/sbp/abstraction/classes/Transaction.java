package com.sbp.abstraction.classes;

public abstract class Transaction {
private int bal;
public Transaction(int bal) {
	this.bal=bal;
}
//public void creditamt(float amt) {
//	//bal = bal + amt
//	bal+=amt;
//	
//}
//public void debitamt(float amt) {
//	bal-=amt;
//}
public abstract void creditamt(float amt) ;
public abstract void debitamt(float amt) ;
}
