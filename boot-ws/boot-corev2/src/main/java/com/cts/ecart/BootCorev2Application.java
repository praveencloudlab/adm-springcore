package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.entity.Product;
import com.cts.ecart.service.ProductService;

@SpringBootApplication
public class BootCorev2Application {

	public static void main(String[] args) {
		
	  ApplicationContext ac=SpringApplication.run(BootCorev2Application.class, args);
	  
	  Product prod=new Product();
	  prod.setId(10);
	  prod.setName("Pen");
	  prod.setPrice(78);
	  
	  ProductService productService = ac.getBean(ProductService.class);
	  
	  productService.save(prod);
	  
	  
	  
	  
	  
	}

}
