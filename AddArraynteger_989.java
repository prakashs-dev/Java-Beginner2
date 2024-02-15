package com.leetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Leetcode{

	public static List<Integer> AddNumber(int[] num, int k) {
		StringBuffer sb = new StringBuffer();
		for (int i : num) {
			sb.append(i);
		}
		BigInteger sum = new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
		List<Integer> list = new ArrayList<>();
		for (char ch : sum.toString().toCharArray()) {
			list.add(Character.getNumericValue(ch));
		}
		return list;
	}
}
public class AddArraynteger_989 {

	public static void main(String[] args) {
		int []num = {2,7,4};
		int k = 181;
		List<Integer> list = Leetcode.AddNumber(num, k);
		System.out.println(list);
	}
}
