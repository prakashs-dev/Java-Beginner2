package com.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings_205 {

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;

		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i), c2 = t.charAt(i);
			if (map.containsKey(c1)) {
				if (map.get(c1) != c2)
					return false;
			} else {
				if (set.contains(c2))
					return false;
				map.put(c1, c2);
				set.add(c2);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "paper", t = "title";
		System.out.println(isIsomorphic(s, t));
	}
}
