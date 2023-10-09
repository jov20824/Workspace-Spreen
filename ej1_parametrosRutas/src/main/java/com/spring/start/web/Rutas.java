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
	
	@GetMapping("/tiempo/{temp}")
	@ResponseBody
	public String rutaTemperatura(@PathVariable int temp) {
		if (temp>40) {
			return "Me aso";
		}
		else {
			return "Hace bueno";
		}
	}
	
}
