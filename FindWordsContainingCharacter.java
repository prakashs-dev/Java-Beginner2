package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'b';
		List<Integer> ans = findWordsContaining(words, x);
		for (int i : ans) {
			System.out.print(i+" ");
		}
	}

	private static List<Integer> findWordsContaining(String[] words, char x) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			for (char ch : words[i].toCharArray()) {
				if(ch == x) {
					list.add(i);
					break;
				}
			}
		}
		return list;
	}

}
