package com.cts.ecart.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.cts.ecart.entity.Product;
@Repository
@Primary
public class MySQLProductDaoImpl implements ProductDao {

	@Override
	public void save(Product product) {
		System.out.println("MYSQLDAO::: product is saved");
		
	}
	
}
