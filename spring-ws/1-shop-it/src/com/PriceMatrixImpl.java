package com;

// dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created...");
	}
	
	/*
	 *  Types of objects
	 *  ========================
	 *  1.dependency : works independently. Never depends on other objects. 
	 *  2.dependent  : always depends on dependency object.
	 * 
	 */
	
	public double getItemPrice(String itemCode) {
		
		// DB code to fetch item price of given item-code
		
		return 100.00;
	}

}
