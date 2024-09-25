package com.sbp.networkbill.classes;

public class Idea implements BillGenerator {

	@Override
	public float generateBill(int networkUsage) {
	return networkUsage * 3;
}
}