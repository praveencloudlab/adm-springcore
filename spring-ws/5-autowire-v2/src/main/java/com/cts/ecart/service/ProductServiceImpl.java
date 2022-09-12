package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	//@Qualifier(value = "productMySQLDBImpl")
	@Qualifier(value = "productOracleDaoImpl")
	private ProductDao prodDao;
	
	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl object created...");
	}

	@Override
	public void save() {
		System.out.println(">>SERVICE:: saving product");
		prodDao.save();
	}

	@Override
	public void findById() {
		System.out.println(">>SERVICE:: finding product");
		prodDao.findById();
	}

}
