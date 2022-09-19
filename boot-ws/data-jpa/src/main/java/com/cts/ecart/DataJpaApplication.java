package com.cts.ecart;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Product;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(DataJpaApplication.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);
		
		
		Product p1=new Product("Laptop", 4856555);
		Product p2=new Product("Mobile", 64364);
		Product p3=new Product("Mouse", 7575);
		Product p4=new Product("Keyboard", 4777);
		Product p5=new Product("HDD", 5758);
		
		
		//prodDao.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
		// display all products
		//prodDao.findAll().forEach(prod->{
		//	System.out.println(prod);
		//});
		
		//prodDao.findAll().forEach(System.out::println);
		
		
		// find by primary key
		
		/*
		Product prod=prodDao.findById(3).orElse(null);
		
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("ID Not Found");
		}
		
		*/
		
		
		/*
		// update 
		Product prod = prodDao.findById(3).orElse(null);
		
		if(prod!=null) {
			prod.setProductName("Apple Mac Book pro");
			prodDao.save(prod);
		}else {
			System.out.println("ID Not Found");
		}
		*/
		
		//prodDao.deleteById(7);
		
		
		// find products by non primary key column...  DSL (Domain specific language)
		// find all products whose name like 'a'
		
		//prodDao.findByProductNameLike("%Mac%").forEach(System.out::println);
        		
		//prodDao.findByPriceBetween(1200, 5000).forEach(System.out::println);
		
		prodDao.findByName("%a%").forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
