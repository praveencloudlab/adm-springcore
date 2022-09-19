package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao prodDao;
	
	@GetMapping("/display")
	public String findAll(Model model){
		
		model.addAttribute("prods", prodDao.findAll());
		
		return "products";
	}
	
	
	
	@GetMapping("/s1")
	public String f1() {
		System.out.println(">>> f1 method");
		return "one";
	}
	
	
	
	
	
	
	
	

}
