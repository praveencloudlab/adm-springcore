package com.cts.ecart.dao;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.ecart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sf;
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public Stream<Product> findAll(){
		return sf.openSession().createQuery("from Product").getResultStream();
	}
	
	
	public Product findById(int id) {
		return sf.openSession().get(Product.class, id);
	}
	
	
	@SuppressWarnings("deprecation")
	public Product save(Product product) {
		Session ses= sf.openSession();
		ses.save(product);
		ses.beginTransaction().commit();
		return product;
	}
	
	
}
