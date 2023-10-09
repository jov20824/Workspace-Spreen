package com.spring.start.web;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.start.utilities.Calcular;

@Controller
public class Rutas {
	
	@GetMapping("/operar")
	@ResponseBody
	public String rutaOperaciones(@RequestParam Map<String,String> numeros) {
		
		String num1 = numeros.get("num1");
		String num2 = numeros.get("num2");
		return Calcular.calculadora(num1,num2);
	}
	
}
