package com.spring.start.utilities;

import java.util.Optional;

public class CalcularHora {
	
	public static String calcularSeg(byte hora,byte minuto,Optional<Byte> segundo) {
		
		byte segundos = segundo.get();
		
		if (hora<=23 && minuto<=59 && segundos<=59) {
			
			segundos++;
			
			if (segundos==60) {
				segundos = 0;
				minuto++;
				
				if (minuto==60) {
					minuto=0;
					hora++;
					
					if (hora==24) {
						hora=0;
					}
				}
			}
			
			return hora+":"+minuto+":"+segundos;
			
		}else {
			return "La hora introducida no es válida";
		}
		
		
	}

	public static String calcularMin(byte hora, byte minuto) {
		
		if (hora<=23 && minuto<=59) {
			
			minuto++;
			
			if (minuto==60) {
				minuto=0;
				hora++;
				
				if (hora==24) {
					hora=0;
				}
			}
			return hora+":"+minuto;
			
		}else {
			return "La hora introducida no es válida";
		}
	}
}
