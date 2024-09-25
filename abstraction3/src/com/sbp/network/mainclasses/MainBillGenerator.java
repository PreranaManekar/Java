package com.sbp.network.mainclasses;

import com.sbp.networkbill.classes.Airtel;
//import com.sbp.networkbill.classes.BillGenerator;
import com.sbp.networkbill.classes.Idea;

public class MainBillGenerator {
	
public static void main(String[] args) {
	
	Airtel airtel = new Airtel();
	
	airtel.method2();
	
	Idea idea = new Idea ();
	idea.method();
	 
//	BillGenerator billgenerator = new BillGenerator();
//	BillGenerator.method3();
	
	
	System.out.println("Your bill is " + airtel.generateBill(150));
	System.out.println("Your bill is " + idea.generateBill(100));

}
}
