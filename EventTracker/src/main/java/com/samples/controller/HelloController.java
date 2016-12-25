package com.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "HelloWorld 2017");
		return "hello";
	}

	@RequestMapping(value="/index")
	public String index(Model model){
		//return "forward:index.jsp";
		System.out.println("Returning Index");
		return "forward:index.jsp";
	}
}
