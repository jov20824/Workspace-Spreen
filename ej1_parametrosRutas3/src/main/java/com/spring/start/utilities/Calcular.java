package com.spring.start.utilities;

import java.util.Map;

public class Calcular {
	
	public static String calculadora(String num1,String num2) {
		
		int numb1 = Integer.parseInt(num1);
		int numb2 = Integer.parseInt(num2);
		
		String devolver="";
		devolver += "Suma: "+(numb1+numb2);
		devolver += "Resta: "+(numb1-numb2);
		devolver += "Multiplicacion: "+(numb1*numb2);
		devolver += "Division: "+(numb1/numb2);
		
		return devolver;
	}
}
