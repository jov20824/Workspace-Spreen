package com.example.demo.controller;

import javax.swing.text.html.HTML;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value="/hola")
	HTML index() {
        return index;
    }

}
