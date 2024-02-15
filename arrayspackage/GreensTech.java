package com.arrayspackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreensTech {
	
	public static void main(String[] args) {
		
//		 	String s = "This is wake done master";
//		    ArrayList<String> list = new ArrayList<>();
//		    int target = 4;
//		    String str[] = s.split(" ");
//		    for(int i = 0; i < str.length; i++){
//		        String ans = str[i];
//		        int count = 0;
//		        for(int j = 0; j < ans.length(); j++){
//		            count++;
//		        }
//		        if(count == target){
//		            list.add(str[i]);
//		        }
//		    }
//				System.out.print(list);
//		Collections.reverseOrder();

		
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < str.length(); i++) {
//			int freq = 1;
//			for (int j = i+1; j < str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j)) {
//					freq++;
//				}
//			}
//			sb.append(str.charAt(i));
//			sb.append(freq);
//			i += freq - 1;
//		}
//		System.out.println(sb.toString());
//		
		
		
//		String s = "test";
//		String ans = lexicographically(s);
//		System.out.println(ans);
		
		String str = "abbhuabcfghh";
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (hmap.containsKey(ch)) {
				int count = hmap.get(ch);
				hmap.put(ch, count + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		String ans =  hmap.toString();
		System.out.println(ans);
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		map.put("Apple", 19);
//		map.put("Apple", 15);
//		map.put("Ball", 14);
//		
//		System.out.println(map);
//		
	}

//	public static String lexicographically(String s) {
//		String str[] = s.split("");
//		Arrays.sort(str,Collections.reverseOrder());
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < str.length; i++) {
//			sb.append(str[i]);
//		}
//		return sb.toString();
//	}
}
