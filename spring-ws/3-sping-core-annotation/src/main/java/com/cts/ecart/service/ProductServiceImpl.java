package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDaoImpl;

@Service
//@Repository
//@Controller
//@Configuration
//@Component
//@Scope("prototype")
//@Lazy(value = true)
//Dependent class
public class ProductServiceImpl {
	
	// dependent needs dependency
	// dependent : ProductServiceImpl
	// dependency : ProductDaoImpl
	
	@Autowired
	private ProductDaoImpl prodDao;
	// creates setter , and injects/passes prodDao to ProductServiceImpl
	
	
	//@Autowired
	public ProductServiceImpl(ProductDaoImpl prodDao) {
		this.prodDao = prodDao;
	}


	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl object created with "+this.hashCode());
	}
	
	
	public void save() {
		System.out.println(">>> ProductServiceImpl:: save method with "+this.hashCode());
		prodDao.saveProduct(); // dao methods invocation
	}
	
	

}
