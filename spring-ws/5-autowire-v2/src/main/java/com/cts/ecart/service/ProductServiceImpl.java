package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;

@Service
@PropertySource(value = "application.properties")
public class ProductServiceImpl implements ProductService {
	
	@Value("${name}")
	private  String customerName;
	
	@Autowired
	private Environment env;

	@Autowired
	//@Qualifier(value = "productMySQLDBImpl")
	@Qualifier(value = "productMySQLDBImpl")
	private ProductDao prodDao;
	
	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl object created...");
	}

	@Override
	public void save() {
		System.out.println(">>SERVICE:: Name: "+customerName);
		System.out.println(">>SERVICE:: Name is : "+env.getProperty("name"));
		System.out.println(">>SERVICE:: saving product");
		prodDao.save();
	}

	@Override
	public void findById() {
		System.out.println(">>SERVICE:: finding product");
		prodDao.findById();
	}

}
