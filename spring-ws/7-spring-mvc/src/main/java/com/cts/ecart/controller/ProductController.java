package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">> f1 method of ProductController");
	}

}
