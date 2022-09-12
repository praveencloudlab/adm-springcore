package com.cts.ecart;

import java.lang.reflect.Method;

class Abc{
	
	public void f1() {
		System.out.println(">> Hello Abc");
	}
}
public class Mobile extends Abc{
	
	Object obj=Abc.class;
	
	@Override
	public void f1() {
		if(obj instanceof Abc) {
			Abc a=(Abc) obj;
			Method[] methods = a.getClass().getMethods();
			
		}
	
		System.out.println(">> Mobile..");
	}
	
	public static void main(String[] args) {
		Abc a=new Mobile();
		a.f1();
		
	}

}
