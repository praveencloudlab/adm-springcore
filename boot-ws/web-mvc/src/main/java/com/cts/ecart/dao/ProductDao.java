package com.cts.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.ecart.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	// DSL
	
	List<Product> findByProductNameLike(String name);
	
	// find products price given start and end range
	List<Product> findByPriceBetween(double startRange,double endRange);
	
	// custom method names :: Query annotation
	
	
	@Query(name = "q1",value = "from Product as p where p.productName like :pn")
	//List<Product> findByName(@Param("productName") String name);
	List<Product> findByName(String pn);
	
	
	
	
	
	
}
