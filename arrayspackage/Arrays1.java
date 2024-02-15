package com.arrayspackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array & String both are the length ==> from 0 to n-1
		
//		int a[] = {1,2,3,4,5,6,7};
//		for (int i = a.length-1; i >= 0; i--) {
//			System.out.print(a[i]);
//		}
		
		
		
		
		List<Object> l = new ArrayList<Object>();
		List<Object> l1 = new LinkedList<Object>();
		l.add("String");
		l.add('P');
		l.add(true);
		l.add(12345);
		l.add(99.99);
		System.out.println("Add "+l);
		l.set(0, "Welcome");
		System.out.println("Set "+l);
		int index = l.indexOf(true);
		System.out.println("index of "+index);

	}
}
