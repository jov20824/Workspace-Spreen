package com.spring.start.utilities;

public class CalcularHora {
	
	public static String calcular(byte hora,byte minuto,byte segundo) {
		
		if (hora<=23 && minuto<=59 && segundo<=59) {

			segundo++;
			
			if (segundo==60) {
				segundo = 0;
				minuto++;
				
				if (minuto==60) {
					minuto=0;
					hora++;
					
					if (hora==24) {
						hora=0;
					}
				}
			}
			
			return hora+":"+minuto+":"+segundo;
			
		}else {
			return "La hora introducida no es válida";
		}
		
	}
}
