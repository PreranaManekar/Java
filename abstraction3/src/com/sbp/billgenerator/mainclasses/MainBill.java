package com.sbp.billgenerator.mainclasses;

import com.sbp.abstraction.billgenerator.classes.Bill;
import com.sbp.abstraction.billgenerator.classes.ResidentialBill;


public class MainBill {
public static void main(String[] args) {
	Bill bill = new ResidentialBill();
	float amount = bill.generateBill(10);
	System.out.println("bill is "+ amount);
	System.out.println("bill is "+bill.generateBill(100));
}
}
