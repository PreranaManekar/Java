package com.sbp.networkbill.classes;

public interface BillGenerator {
	
float generateBill(int internateUsage);

public void method();
public void method1();

public default void method2() {
	System.out.println("hello");
	method4();
}
	public static void method3() {
		System.out.println("static method");
		
}

	private void method4() {
		System.out.println("private method");
	}
//	public abstract float generateBill(int internateUsage);
}
