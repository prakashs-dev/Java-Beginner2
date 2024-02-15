package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Dog {
	int leg;
}
public class Sample {
	static void swap(Dog d1, Dog d2) {
    	Dog temp = d2;
    	d2 = d1;
    	d1 = temp;
//    	System.out.println(d1.leg+" "+d2.leg);
	}
	static void modify(Dog d1) {
    		d1.leg = 0;
	}

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
    	d1.leg = 4;
    	Dog d2 = new Dog();
    	d2.leg = 3;
    	swap(d1, d2);
    	System.out.println("d1.leg = "+d1.leg+" "+"d2.leg: "+d2.leg);
    	modify(d1);
    	System.out.println("d1.leg = "+d1.leg);

		
//		Map<Integer, List<String>> routeWithFare = new HashMap<>();
//		String[] route = { "13", "13-c", "342-R", "146-Q", "27", "29-A", "215-U", "27-E1", "13J", "SBS-D34G" };
//		int[] fare = { 10, 15, 10, 10, 15, 12, 12, 15, 12, 10 };
//		for (int i = 0; i < route.length; i++) {
//			String rou = route[i];
//			int far = fare[i];
//			if (!routeWithFare.containsKey(far)) {
//				routeWithFare.put(far, new ArrayList<>());
//			}
//			routeWithFare.get(far).add(rou);
//		}
//		for (Map.Entry<Integer, List<String>> entry : routeWithFare.entrySet()) {
//			int f = entry.getKey();
//			List<String> r = entry.getValue();
//			System.out.println(f + "\t" + r);
//		}
	}
}
