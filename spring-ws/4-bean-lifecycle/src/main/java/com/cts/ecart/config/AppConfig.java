package com.cts.ecart.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

//@ComponentScan("com.cts.ecart.service")
@Lazy(value = false) // eager invocation
// note: eager invocation works only when bean scope defined as 'singleton'
//@Scope("singleton") 
@Scope("prototype")
public class AppConfig {
	
	// Initialization
	public AppConfig() { // 1. constructor
		System.out.println("1.Constructor::AppConfig object created by "+this.hashCode());
	}
	
	
	// step2 : post construct :: gets called immediate after constructor
	@PostConstruct
	void f1() { 
		System.out.println("2.PostConstruct:: f1 executed by "+this.hashCode());
	}
	@PostConstruct
	void f11() { 
		System.out.println("2.PostConstruct-v1:: f11 executed by "+this.hashCode());
	}
	
	
	// step3 : bean : gets called after post construct
	// note : bean annotation works only when bean scope defined as prototype
	// note: bean always creats new object for every invocation in-case of single scope
	@Bean // @Bean works only if bean type defined as eager
	void f2() {
		System.out.println("3.Bean:: f2 executed by "+this.hashCode());
	}
	
	@Bean // @Bean works only if bean type defined as eager
	void f22() {
		System.out.println("3.Bean:: f22 executed by "+this.hashCode());
	}
	
	@Bean // @Bean works only if bean type defined as eager
	void f222() {
		System.out.println("3.Bean:: f222 executed by "+this.hashCode());
	}
	
	// step4 : pre destroy : gets called before container object is destroyed
	// note: preDestroy annotation gets executed if bean type is singleton
	@PreDestroy
	void f3() {
		System.out.println("4.PreDestroy:: f3 executed by "+this.hashCode());
	}
	

}
