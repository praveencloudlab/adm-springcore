package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.entity.Product;

@Service // i18n
public class ProductServiceImpl implements ProductService {
	
	@Value("${msg}")
	private String message;
	
	@Autowired
	@Qualifier(value = "productDaoImpl")
	private ProductDao prodDao;
	
	@Override
	public void save(Product product) {
		System.out.println("Message: "+message);
		System.out.println("SERVICE:: saving product..");
		prodDao.save(product);
	}
	


}
