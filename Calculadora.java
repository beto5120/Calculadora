package com.netasystems.calculadora.business;

public class Calculadora {
	
	public double suma(double op1, double op2) {
		return op1 + op2;
	}
	
	public double resta(double op1, double op2) {
		return op1 - op2;
	}
	
	public double multi(double op1, double op2) {
		return op1 * op2;
	}
	
	public double division(double op1, double op2) {
		if(op2 == 0) {
			return 0;
		}
		return op1 / op2;
	}

}
