package com.cts.ecart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.ecart.service.ProductServiceImpl;

public class Test2 {

	public static void main(String[] args) {
	
		// creating spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		
		
		ProductServiceImpl ps = context.getBean("prod1",ProductServiceImpl.class);	
		ps.save();
		
		
		//dao.saveProduct();
		
		
		
		
		

	}

}
