package com.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Demonstration {
	public static String solution(String inputStr) {
		String[] s = inputStr.split("\\s+");
		StringBuffer sb = new StringBuffer();
		for (String str : s) {
			if (!str.isEmpty()) {
				sb.append(str.trim() + ",");
			}
		}
		return sb.substring(0, sb.length() - 1).toString();
	}

	public static int Levenshtein(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		// Create a matrix to store the minimum edit distances
		int[][] dp = new int[m + 1][n + 1];

		// Initialize the matrix with base cases
		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], // Deletion
							Math.min(dp[i][j - 1], // Insertion
									dp[i - 1][j - 1])); // Substitution
				}
			}
		}
		return dp[m][n];
	}

	public static void union(String ar, String arr) {
		String[] st1 = ar.split(" ");
		String[] st2 = arr.split(" ");
		List<String> list1 = Arrays.asList(st1);
		List<String> list2 = Arrays.asList(st2);

		List<String> unions = new ArrayList<>();
		unions.addAll(list1);
		for (String s : list2) {
			if (!(list1.contains(s))) {
				unions.add(s);
			}
		}
		List<String> intersect = new ArrayList<>();
		intersect.addAll(list1);
		intersect.retainAll(list2);

		List<String> oddList1 = new ArrayList<>();
		for (String odd : list1) {
			if (Integer.parseInt(odd) % 2 == 0) {
				oddList1.add(odd);
			}
		}
		List<String> evenList2 = new ArrayList<>();
		for (String even : list2) {
			if (Integer.parseInt(even) % 2 == 1) {
				evenList2.add(even);
			}
		}
		oddList1.addAll(evenList2);
		result(unions);
		result(intersect);
		result(oddList1);
	}

	private static void result(List<String> unions) {
		for (String num : unions) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static int calculateChecksum(String n) {

		int sum = 0;
		for (int i = n.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(n.charAt(i));
			// Rightmost position starts at 0
			int position = n.length() - 1 - i;
			// Double the digits at even positions
			if (position % 2 == 0) {
				digit *= 2;
				// Subtract 9 if the result is >= 10
				if (digit >= 10) {
					digit -= 9;
				}
			}
			sum += digit;
		}

		// If the result is a multiple of 10, checksum digit will be 0
		if (sum % 10 == 0) {
			return 0;
		} else {
			// Otherwise, checksum digit is the num required to make the sum a multiple of
			// 10
			return 10 - (sum % 10);
		}

	}

}

public class Assignment {

	private static final String[] KEYPAD = { " .,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	private static Map<String, Boolean> memo = new HashMap<>();

	public static void main(String[] args) {

//		String s = "			  ab  			 cd  				 ef					";
//		String res = Demonstration.solution(s);
//		System.out.println(res);

//		String str1 = "kitten", str2 = "sitting";
//		System.out.println(Demonstration.Levenshtein(str1, str2));

		// Union and Intersection 4

		String ar = "1 2 5 3 8 9";
		String arr = "1 7 5 8";
//		Demonstration.union(ar, arr);

//		String num = "13";
//		System.out.println(Demonstration.calculateChecksum(num));

//		print diamond pattern
//		int n = 3;
//		printDiamondPattern(n);

//		phone diractory
//		String input = "44335550555666196667775553";
//		System.out.println(translateKeystrokes(input));

		List<Integer> nums = Arrays.asList(1,1);
		System.out.println(isGoodArray(nums));

//		String word = "ab", pattern = ".*";
//		System.out.println(isMatchHelper(word, pattern));

	}

	private static boolean isMatchHelper(String word, String pattern) {

		return isMatchHelper(word, pattern, 0, 0);
	}

	private static boolean isMatchHelper(String word, String pattern, int i, int j) {

		String key = i + "," + j;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}
		if (j == pattern.length()) {
			return i == word.length();
		}

		boolean firstMatch = (i < word.length() && (word.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.'));
		boolean result;

		if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
			result = (isMatchHelper(word, pattern, i, j + 2) || (firstMatch && isMatchHelper(word, pattern, i + 1, j)));
		} else {
			result = firstMatch && isMatchHelper(word, pattern, i + 1, j + 1);
		}
		memo.put(key, result);
		return result;

	}

	private static boolean isGoodArray(List<Integer> nums) {

		int length = nums.size();
		if (length < 1)
			return false;

		Map<Integer, Integer> freqNum = new HashMap<>();
		for (int i : nums) {
			freqNum.put(i, freqNum.getOrDefault(i, 0) + 1);
		}
		for (int i = 1; i < length; i++) {
			if (freqNum.getOrDefault(i, 0) != 1) {
				return false;
			}
		}
		return freqNum.getOrDefault(length, 0) == 2;

	}

	private static String translateKeystrokes(String input) {

		StringBuilder result = new StringBuilder();
		char[] chars = input.toCharArray();
		int n = chars.length;

		for (int i = 0; i < n; i++) {
			if (chars[i] != '0') {
				char currentChar = chars[i];
				int count = 1;

				// Count consecutive identical keystrokes
				while (i + 1 < n && chars[i + 1] == currentChar) {
					count++;
					i++;
				}

				// Find the corresponding alphabet
				int keyIndex = currentChar - '1';
				if (keyIndex >= 0 && keyIndex < KEYPAD.length) {
					String keyString = KEYPAD[keyIndex];
					int charIndex = (count - 1) % keyString.length();
					result.append(keyString.charAt(charIndex));
				}
			}
		}
		return result.toString();

	}

	private static void printDiamondPattern(int n) {
//		n = 3 => 0, 1, 2
		for (int i = 0; i < n; i++) {
			printRow(i);
		}
		for (int i = n - 2; i >= 0; i--) {
			printRow(i);
		}
	}

	private static void printRow(int row) {

		StringBuilder sb = new StringBuilder();
//		4
		for (int j = 0; j <= row * 2; j++) {
			if (j % 2 == 0) {
				sb.append('1');
			} else {
				sb.append('0');
			}
		}
		System.out.println(sb.toString());
	}
}
