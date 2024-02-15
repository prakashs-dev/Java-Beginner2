package com.recurision;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pattern_print {

	public static void main(String args[]) {

//		String s = "A man, a plan, a canal: Panama";
//		String str[] = s.split(" ");
//		
//		Map<String, Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < str.length; i++) {
//			if (map.containsKey(str[i])) {
////				map.put(s, null)
//			} else {
//				map.put(str[i], 1);
//			}
//		}
	
//		int start = 0, end = s.length();
//		
//		while(start < end) {
//			if(Character.is)
//		}
	
		int []nums = {2,2,3,2};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		System.out.println(map);
	
	
	}
}
