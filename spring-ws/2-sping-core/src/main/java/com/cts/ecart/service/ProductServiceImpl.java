package com.cts.ecart.service;

import com.cts.ecart.dao.ProductDaoImpl;

public class ProductServiceImpl {
	
	private ProductDaoImpl prodDao;
	
	
	
	public ProductDaoImpl getProdDao() {
		return prodDao;
	}


	public void setProdDao(ProductDaoImpl prodDao) {
		this.prodDao = prodDao;
	}


	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl object created with "+this.hashCode());
	}
	
	
	public void save() {
		System.out.println(">>> ProductServiceImpl:: save method with "+this.hashCode());
		// dao methods invocation
		prodDao.saveProduct();
		
		
	}
	
	

}
