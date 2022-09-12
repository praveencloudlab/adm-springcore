package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(">>>>> main <<<<<");
		
		// 1. get container object (ac)
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig app = ac.getBean(AppConfig.class);
		app.f2(); // normal ... 
		app.f2(); // normal ... 
		app.f2(); // normal ... 
		app.f2(); // normal ... 
		app.f2(); // normal ... 
		//2. get beans from the container using getBean method on top of ac object
		//CartServiceImpl cs = ac.getBean(CartServiceImpl.class);
		//cs.addToCart();
		
		 ac.close();
		//ac.registerShutdownHook();
		
		
	
	}

}
