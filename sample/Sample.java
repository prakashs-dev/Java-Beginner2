package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Sample {

	public static void main(String[] args) {

//		Map<String, Integer> map = new HashMap<>();
//		map.put("Good", 1);
//		map.put("Morning", 2);
//		map.put("Bad", 3);
//		map.put("Boy", 4);
//		
//		for (Map.Entry<String, Integer> it : map.entrySet()) {
//			System.out.println(it.getKey()+" "+it.getValue());
//		}

//		int[] nums = {6,5,4,4};
//		System.out.println(isMonotonic(nums));

//		int[] ar = { 1, 0, 3, 4, 0, 6, 0, 8, 0 };
//		int nonZero = 0;
//		for (int i = 0; i < ar.length; i++) {
//			if(ar[i] != 0) {
//				int temp = ar[i];
//				ar[i] = ar[nonZero];
//				ar[nonZero] = temp;
//				nonZero++;
//			}
//		}
//		
//		for (int i : ar) {
//			System.out.print(i+" ");
//		}

//		int[] nums = {1,2,2,3,1,4};
//		System.out.println(maxFrequencyElements(nums));

//		Queue<Integer> que = new LinkedList<>();
//		que.offer(1);
//		que.offer(2);
//		que.offer(3);
//		que.offer(4);
//		que.offer(5);
//		System.out.println(que);
//		System.out.println("Top Element "+que.peek());
//		que.poll();
//		System.out.println("Remove Element "+que.poll());
//		System.out.println(que);
//		

//		int n = 111;
//		System.out.println(isFascinating(n));

//		int n = 9;
//		System.out.println(sumOfMultiples(n));

//		int[] nums = { 1, 2, 3, 2 };
//		System.out.println(sumOfUnique(nums));

//		int[] nums = {1,2,1,3,2,5};
//		int[] ar = singleNumber(nums);
//		for (int i : ar) {
//			System.out.print(i+" ");
//		}

//		int[] nums = { 555, 901, 482, 1771 };
//		System.out.println(findNumbers(nums));

//		String s = "ace", t = "abcde";
//		System.out.println(isSubsequence(s,t));

//		String s = "a#c", t = "b";
//		System.out.println(backspaceCompare(s,t));

//		int[] arr = { 2, 3, 4, 7, 11 };
//		int k = 5;
//		System.out.println(findKthPositive(arr, k));

//		String s = "4135/+";
//		System.out.println(postFixStack(s));

//		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
//		System.out.println(evalRPN(tokens));

//		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
//		List<List<String>> str = groupAnagrams(strs);
//		for (int i = 0; i < str.size(); i++) {
//			for (int j = 0; j < str.size(); j++) {
//				System.out.print(str.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}
		
		String s1 = "this apple is sweet", s2 = "this apple is sour";	
		System.out.println(s2.length());
		String[] out = uncommonFromSentences(s1,s2);
		for (String str : out) {
			System.out.print(str+" ");
		}
		
	}

	private static String[] uncommonFromSentences(String s1, String s2) {
		List<String> list1 = Arrays.asList(s1);
		List<String> list2 = Arrays.asList(s2);
		System.out.println(list1);
		System.out.println(list2);
		return null;
	}

	private static List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length == 0) {
			return null;
		}
		int[] noPrime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97, 101, 103 };
		Map<Integer, List<String>> map = new HashMap<>();
		for (String word : strs) {
			int prod = 1;
			for (int i = 0; i < word.length(); i++) {
				prod = prod * noPrime[word.charAt(i) - 'a'];
			}
			if (map.containsKey(prod)) {
				map.get(prod).add(word);
			} else {
				map.put(prod, new ArrayList<String>());
				map.get(prod).add(word);
			}
		}

		List<List<String>> out = new ArrayList<List<String>>();
		for (List<String> res : map.values()) {
			out.add(res);
		}
		return out;
	}

//	private static int evalRPN(String[] tokens) {
//		Stack<Integer> st = new Stack<>();
//		int x,y;
//		for (String str : tokens) {
//			if (str.equals("+")) {
//				st.push(st.pop() + st.pop());
//			} else if (str.equals("-")) {
//				y = st.pop();
//				x = st.pop();
//				st.push(x - y);
//			} else if (str.equals("*")) {
//				st.push(st.pop() * st.pop());
//			} else if (str.equals("/")) {
//				y = st.pop();
//				x = st.pop();
//				st.push(x / y);
//			} else {
//				st.push(Integer.parseInt(str));
//			}
//		}
//		return st.pop();
//	}

	private static int postFixStack(String s) {

		Stack<Integer> st = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				st.push(Character.getNumericValue(ch));
			} else {
				int fTop = st.pop(), sTop = st.pop();
				switch (ch) {
				case '+':
					st.push(sTop + fTop);
					break;
				case '-':
					st.push(sTop - fTop);
					break;
				case '*':
					st.push(sTop * fTop);
					break;
				case '/':
					st.push(sTop / fTop);
					break;
				}
			}
		}

		return st.peek();
	}

	public static int findKthPositive(int[] arr, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				System.out.println("skip");
				continue;
			} else {
				list.add(i + 1);
			}
		}
		System.out.println(list);
		return 0;
	}

	public static boolean backspaceCompare(String s, String t) {
		int sCount = 0, tCount = 0;
		for (int i = 0; i < s.length() || i < t.length(); i++) {
			if (i < s.length() && s.charAt(i) == '#') {
				sCount++;
			}
			if (i < t.length() && t.charAt(i) == '#') {
				tCount++;
			}
		}
		return sCount == tCount;
	}

	private static boolean isSubsequence(String s, String t) {

		List<Character> list = new ArrayList<>();
		boolean[] out = new boolean[26];
		for (char ch : t.toCharArray()) {
			list.add(ch);
		}
		for (char c : s.toCharArray()) {
			out[c - 'a'] = true;
		}
		for (boolean b : out) {
			if (!b)
				return false;
		}
		return true;
	}

	private static int findNumbers(int[] nums) {
		int count = 0;
		for (int i : nums) {
			int len = String.valueOf(i).length();
			if (len % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int[] singleNumber(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			if (list.contains(i)) {
				list.remove(i);
			} else {
				list.add(i);
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

	private static int sumOfUnique(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i : nums) {
			if (list.contains(i)) {
				sum = sum - i;
				list.remove(i);
			} else {
				sum += i;
				list.add(i);
			}
		}
//		System.out.println(sum);
		return sum;
	}

	private static int sumOfMultiples(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	private static boolean isFascinating(int n) {
		StringBuffer sb = new StringBuffer();
		sb.append(n);
//		sb.append(n*2);
		sb.append(n * 3);
		System.out.println(sb);
		int[] fasNumber = new int[9];
		for (char ch : sb.toString().toCharArray()) {
			if (ch != '0') {
				fasNumber[ch - '0' - 1]++;
			} else {
				return false;
			}
		}
		for (int i : fasNumber) {
			if (i > 1)
				return false;
//			System.out.print(i+" ");
		}
		return true;
	}

	private static int maxFrequencyElements(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int sum = 0;
		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			if (it.getValue() > 1) {
				sum += it.getValue();
			}
		}
		System.out.println(map);
		return 0;
	}

	private static boolean isMonotonic(int[] nums) {
		boolean increasing = Boolean.TRUE, decreasing = Boolean.TRUE;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				increasing = Boolean.FALSE;
			} else if (nums[i] < nums[i + 1]) {
				decreasing = Boolean.FALSE;
			}
		}
		return increasing || decreasing;
	}
}
