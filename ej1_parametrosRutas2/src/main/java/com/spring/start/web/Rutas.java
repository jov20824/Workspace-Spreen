package com.spring.start.web;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {
	
	@GetMapping("/nota/{nota}")
	@ResponseBody
	public String rutaTemperatura(@PathVariable double nota) {
		
		if (nota>=5 & nota<6) return "suficiente";
		if (nota>=6 & nota<7) return "bien";
		if (nota>=7 & nota<9) return "notable";
		if (nota>=9 & nota<=10) return "sobresaliente";
		else {
			return "insuficiente";
		}
	}
	
}
