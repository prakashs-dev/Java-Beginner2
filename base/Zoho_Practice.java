package com.base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Zoho_Practice {

	public static void main(String[] args) {

//		String s = "Programming";
//
//		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			if (map.containsKey(s.charAt(i))) {
//				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//			} else {
//				map.put(s.charAt(i), 1);
//			}
//		}
//
//		for (Entry<Character, Integer> ans : map.entrySet()) {
//			if (ans.getValue() >= 2) {
//				System.out.println(ans.getKey() + " : " + ans.getValue());
//			}
//
//		}

		String s = "a10b20c20";
		String num = "";
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				if (num != "") {
					int n = Integer.parseInt(num);
					for (int j = 0; j < n; j++) {
						System.out.print(ch);
					}
				}
				ch = s.charAt(i);
				num = "";
			} else {
				num += s.charAt(i);
			}
		}
		int n = Integer.parseInt(num);
		for (int j = 0; j < n; j++) {
			System.out.print(ch);
		}

	}
}
