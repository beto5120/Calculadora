package com.netasystems.calculadora.main;

import com.netasystems.calculadora.business.Calculadora;

public class Main {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		String primerArg = args[0];
		String segundoArg = args[1];
		String tercerArg = args[2];
		
		try {
			
		}catch(NumberFormatException ne) {
			System.out.println("No se ha podido convertir la entrada de texno en numero.");
			System.out.println("MEnsaje de error: "+ne.getMessage());
			System.exit(-1);
		}
		
		Double op1 = Double.parseDouble(primerArg);
		Double op2 = Double.parseDouble(segundoArg);
		
		double resultado;
		switch (tercerArg) {
		case "+":
			resultado = calc.suma(op1, op2);
			break;
			
		case "-":
			resultado = calc.resta(op1, op2);
			break;
			
		case "*":
			resultado = calc.multi(op1, op2);
			break;
		
		case "/":
			resultado = calc.division(op1, op2);
			break;
			
		default:
			resultado = -1;
			break;
			
		}
		System.out.println("El resultado de la operacion es: "+resultado);
		
	}

}
