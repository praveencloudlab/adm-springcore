package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/s1")
	public String f1(Model model) {
		String user="Admin";
		System.out.println(">> f1 method of ProductController");
		model.addAttribute("userName", user);
		return "one";
	}

}
