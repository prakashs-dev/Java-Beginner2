package com.OOPS.Inheritance.Hierarchical;

public class C3 extends P1{

	int n = 3;
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		
		System.out.println("c1 "+c1.num*c1.number);
		System.out.println("c2 "+c2.num*c2.nums);
		System.out.println("c3 "+c3.num*c3.n);
		
	}
}
