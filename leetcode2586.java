package com.leetCode;

public class problem2586 {

	public static void main(String[] args) {

		String[] words = { "hey","aeo","mu","ooo","artro"};
		int left = 1, right = 4, count = 0;
		for (int i = left; i <= right; i++) {
			String s = words[i];
			char start = s.charAt(0);
			char end = s.charAt(s.length()-1);
			if ((start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u')
					&& (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u')) {
				count++;
			}
		}

		System.out.println("String Count : " + count);
	}
}
