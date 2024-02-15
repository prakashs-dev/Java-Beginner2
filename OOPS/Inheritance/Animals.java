package com.OOPS.Inheritance;
//Single level inheritance
//Multiple level inheritance
public class Animals extends Sounds {

	public static void main(String[] args) {
		Animals obj = new Animals();
		obj.cat();
		obj.cow();
		obj.dog();
		obj.cat();
		obj.Cow();
		obj.dog();
		
	}
}
