package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.ecart.service.ProductServiceImpl;

public class Test2 {

	public static void main(String[] args) {
	
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductServiceImpl ps = context.getBean(ProductServiceImpl.class);
		
		
		ps.save();
		
		

	}

}
