package com.sbp.arithmeticoperations.mainclasses;

import com.sbp.arithematicoperations.classes.ArithematicOperations;

public class MainArithematicOperations {
	
public static void main(String[] args) {
	ArithematicOperations addition = new ArithematicOperations()
			{
		@Override
		public int doOperation(int operand1 , int operand2) {
			return operand1 + operand2 ;
		}
		
		public int doSubstraction(int operand1 ,int operand2 ) {
			return operand1 - operand2 ;
		}
		
		public int doMultiply(int operand1 ,int operand2 ) {
			return operand1 * operand2 ;
		}
	}.;
	System.out.println("add is " + addition.doOperation(10,20));
	System.out.println(""+addition.doSubstraction(4,2));
	System.out.println(""+addition.doMultiply(4,2));
}
}