package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.service.C3;
import com.cts.ecart.service.utils.C4;
@SpringBootApplication // auto discovery
//@ComponentScan("com")
public class BootCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(BootCoreApplication.class, args);
		
		C1 c1 = ac.getBean(C1.class);
		C2 c2 = ac.getBean(C2.class);
		C3 c3 = ac.getBean(C3.class);
		C4 c4 = ac.getBean(C4.class);
		
		c1.f1();
		c2.f2();
		c3.f3();
		c4.f4();
		
		
	}

}
