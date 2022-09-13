package com.cts.ecart;

interface I1{
	void f1();
}
public class Use implements I1{
	@Override
	public void f1() {}
	public static void main(String[] args) {
		
		//Use u=new Use();
		//u.f1();
		I1 i=new Use();
		i.f1();
		
	}

}
