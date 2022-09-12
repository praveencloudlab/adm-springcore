package com.cts.ecart.dao;
import org.springframework.stereotype.Repository;
@Repository
public class ProductMySQLDBImpl implements ProductDao{

	// MYSQL DB
	
	@Override
	public void save() {
		System.out.println("MYSQL-DAO:: save");
	}

	@Override
	public void findById() {
		System.out.println("MYSQL-DAO:: findById");
		
	}
	

}
