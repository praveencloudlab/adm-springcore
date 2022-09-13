package com.cts.ecart.dao;

import java.util.stream.Stream;

import com.cts.ecart.entity.Product;
public interface ProductDao {

	Stream<Product> findAll();

	Product findById(int id);

	Product save(Product product);

}