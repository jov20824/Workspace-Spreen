package com.spring.start.web;

import java.util.Map;
import java.util.Optional;

import javax.swing.text.html.HTML;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {
	
//	@GetMapping("/")
//	@ResponseBody
//	public String rutaInicial() {
//		return "<h1>Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis Hola Luis \r\n"
//				+ "</h1>";
//	}
	
//	//El PathVariable sirve para poder introducir lo que quieras en la URL.
//	@GetMapping("/hola/{nombre}/{apellido}/{ciudad}")
//	@ResponseBody
//	public String otraRutaInicial(@PathVariable Map<String,String> mapa) {
//		String nombre = mapa.get("nombre");
//		String apellido = mapa.get("apellido");
//		String ciudad = mapa.get("ciudad");
//		return nombre+" "+apellido+" "+ciudad;
//	}
//	
//	@GetMapping("/hola/{nombre}/{apellido}")
//	@ResponseBody
//	public String miGet(@RequestParam String nombre, @RequestParam String apellido) {
//	
//		return nombre + " " + apellido;
//		
//	}
	@GetMapping("/hola")
	@ResponseBody
	public String miGet2(@RequestParam Optional<Integer> id) {
		
		if (id.isPresent()) {
			return "Hola "+id.get();
		}
		else {
			return "Hola mi rey";
		}
	}
	@GetMapping("/adios/{id}/{nombre}")
	@ResponseBody
	public String miGet3(@PathVariable Optional<Integer> id , @PathVariable Optional<String> nombre) {

		return "Hola"+nombre.get()+id.get();
	}
	@GetMapping("/hola/jandro/adios")
	@ResponseBody
	public String comoTeApetezca(@RequestHeader Map<String,String> request) {
		
		
		
		for(String llave: request.keySet()) {
			System.out.println(llave+" : "+request.get(llave));
		}
		
		return("OK");
	}
	@PostMapping("/put")
	@ResponseBody
	public String miPost(@RequestParam String name,
			@RequestParam String email,
			@RequestParam String msg) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(msg);
		
		return "OK·";
	}
	
}
