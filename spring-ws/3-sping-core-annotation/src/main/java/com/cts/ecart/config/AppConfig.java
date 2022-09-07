package com.cts.ecart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.cts.ecart.service,com.cts.ecart.dao"})
public class AppConfig {
	
	@Bean
	public void f2() {
		System.out.println(">>> AppConfig:: f2 method");
	}
	
	
	@Bean
	public void f1() {
		System.out.println(">>> AppConfig:: f1 method");
	}
	
	

}
