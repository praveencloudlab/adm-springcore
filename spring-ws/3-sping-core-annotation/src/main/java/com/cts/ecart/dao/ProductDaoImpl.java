package com.cts.ecart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
	
	public ProductDaoImpl() {
		System.out.println(">>> ProductDaoImpl object created...");
	}
	
	public void saveProduct() {
		System.out.println(">>> ProductDaoImpl:: saveProduct method");
	}

}
