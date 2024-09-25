package com.sbp.abstraction.classes;

public class Operation extends Transaction{
	public Operation (int bal) {
		this.bal=bal;
	}
@override
public void debitamt(float amt) {
	bal-=amt;
}
@override
public void creditamt(float amt) {
	bal+=amt;
}
public void checkbal() {
	System.out.println("your bal"+bal);
}
}