package com.spring.start.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {
	
	@GetMapping("/dolar/")
	@ResponseBody
	public Double rutaOperaciones(@RequestParam Map<String,String> dinero) {
		
		Double dolares = Double.parseDouble(dinero.get("dinero"))*1.05;
		
		return dolares;
	}
	@GetMapping("/dolar/{dinero}")
	@ResponseBody
	public Double rutaOperaciones2(@PathVariable Double dinero) {
		
		Double dolares = dinero*1.05;
		
		return dolares;
	}
}
