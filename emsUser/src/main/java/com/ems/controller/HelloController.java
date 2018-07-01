package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {

	public String sayHello(Model model){
		
		
		return "hello";
	}
	
	
}
