package com.cts.ecart.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.cts.ecart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Override
	public void save(Product product) {
		System.out.println("DAO::Product saved "+product.getName());
	}

}
