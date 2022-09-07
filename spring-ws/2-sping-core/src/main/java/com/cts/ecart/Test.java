package com.cts.ecart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.ecart.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
	
		// creating spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		// ProductServiceImpl ps1= (ProductServiceImpl)context.getBean("prod1");
		// ProductServiceImpl ps = context.getBean("prod",ProductServiceImpl.class);
		ProductServiceImpl ps1 = context.getBean("prod1",ProductServiceImpl.class);
		ProductServiceImpl ps2 = context.getBean("prod1",ProductServiceImpl.class);
		ProductServiceImpl ps3 = context.getBean("prod1",ProductServiceImpl.class);
		//ProductServiceImpl ps2 = context.getBean("prod2",ProductServiceImpl.class);

		ps1.save();
		ps2.save();
		ps3.save();
		//ps2.save();
		
		//ProductDaoImpl dao = context.getBean("prodDao",ProductDaoImpl.class);
		
		
		

	}

}
