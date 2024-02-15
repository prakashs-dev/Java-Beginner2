package com.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
//		String ans = sb.toString();
		return sb.substring(0, sb.length()-1).toString();
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
			if (Integer.parseInt(odd)%2==0) {
				oddList1.add(odd);
			}
		}
		List<String> evenList2 = new ArrayList<>();
		for (String even : list2) {
			if (Integer.parseInt(even)%2==1) {
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
			System.out.print(num+" ");
		}
		System.out.println();
	}
}

public class Assignment {

	public static void main(String[] args) {
		String s = "			  ab  			 cd  				 ef					";
		String res = Demonstration.solution(s);
		System.out.println(res);

//		String str1 = "flaw", str2 = "lawn";
//		System.out.println(Demonstration.Levenshtein(str1, str2));

		// Union and Intersection 4

		String ar = "1 2 5 3 8 9";
		String arr = "1 7 5 8";
//		Demonstration.union(ar, arr);

	}
}
