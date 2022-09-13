package com.cts.ecart.service;

import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao prodDao;
	@Transactional
	public Stream<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Transactional
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

}
