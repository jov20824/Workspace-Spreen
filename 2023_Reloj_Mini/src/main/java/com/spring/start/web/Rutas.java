package com.spring.start.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.start.utilities.CalcularHora;

@Controller
public class Rutas {
	
	@GetMapping(value={"/relojMini/{hora}/{minuto}" , "/relojMini/{hora}/{minuto}/{segundo}"})
	@ResponseBody
	public String rutaOperaciones(@PathVariable byte hora,@PathVariable byte minuto,@PathVariable Optional<Byte> segundo) {
		
		if (segundo.isPresent()) {
			return CalcularHora.calcularSeg(hora, minuto, segundo);
		}
		else {
			return CalcularHora.calcularMin(hora,minuto);
		}
			
	}

}
