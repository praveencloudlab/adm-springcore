package com.cts.ecart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductOracleDaoImpl implements ProductDao {
	
	public ProductOracleDaoImpl() {
		System.out.println("ProductDaoImpl object created");
	}
	
	// Oracle DB
	
	@Override
	public void save() {
		
		System.out.println(">>ORACLE-DAO:: saving product");
	}
	@Override
	public void findById() {
		System.out.println(">>ORACLE-DAO:: finding product");
	}

}
