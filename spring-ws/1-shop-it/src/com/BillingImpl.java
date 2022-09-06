package com;

//dependent
public class BillingImpl {
	
	/*
	 * issues with this code
	 * =========================
	 * -> too many dependency object creations...
	 * 		-> memory management is very difficult
	 * 		-> performance of application goes down
	 * 
	 *  why this issue happened?
	 *  ----------------------------
	 *  -> dependent class itself creating dependency object directly
	 *  
	 *  what is the solution?
	 *  -----------------------
	 *  -> don't create dependency objects in the dependent class directly
	 *  -> instead, use look up techniques like JNDI etc..
	 *  -> JNDI location is tightly coupled with dependent class
	 *  
	 *  what is the best solution?
	 *  ------------------------------
	 *  -> do not create dependency object directly or find it, 
	 *     instead ask some one (container) to inject / pass (IoC) inversion of control
	 *  
	 *   how to implement IoC here? : 
	 *   ------------------------------
	 *   -> use dependency injection (DI) technique
	 *   
	 *   what is dependency injection? 
	 *   ------------------------------
	 *   -> injecting / passing dependency object to the dependent object is called DI
	 *  
	 * 
	 *   In how many ways DI can be implemented? : 2 ways
	 *   --------------------------------------------------
	 *   1. setter based DI
	 *   2. constructor based DI
	 *   
	 *   1. setter based DI
	 *   -----------------------
	 *   -> define dependency class reference in dependent at class level.
	 *   -> create / generate setter for above defined reference.
	 * 
	 * 
	 * 
	 * 
	 */
	
	private PriceMatrixImpl price;
	
	
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}



	public double getCartTotal(String[] cart) {
		
		double total=0.0;
		
		// PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		
		for(String itemCode:cart) {
			
			total=total+price.getItemPrice(itemCode);
		}
		
		return total;
	}

}
