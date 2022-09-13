package com.cts.ecart.service;

import java.util.stream.Stream;

import com.cts.ecart.entity.Product;

public interface ProductService {

	Stream<Product> findAll();

	Product findById(int id);

	Product save(Product product);

}
