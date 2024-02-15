package com.sample;

public class Demo {

	public static void main(String[] args) {

//		choclate cost - 1 rs
//		15rs in hand
//		3 wrappers -> 1 hoc	

		int choclateCost = 1;
		int rs = 15; // 5 cho, 5
		int wrappers = 3;
		int hoc = 2;
		int out = 0;

		for (int i = 1; i <= rs; i++) {
			out += choclateCost;
		}
		out = out - wrappers + hoc;
//		System.out.println(out);

//	input integer

////		12543 -> 12043
//		int n = 12543;
//		int temp = n;
//		int res = 0;
//		while (temp > 0) {
//			int dig5 = temp % 10;
//			res = (res * 10) + dig5;
//			temp = temp / 10;
//		}
//		int temp1 = 0;
//		while (res > 0) {
//			int num5 = res % 10;
//			if (num5 == 5) {
//				num5 = 0;
//			}
//			temp1 = (temp1 * 10) + num5;
//			res = res / 10;
//		}
//		System.out.println(n+" -> "+temp1);

//		int n = 12543;
//		String s = String.valueOf(n);
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == '5') {
//				s = s.replaceAll(Character.toString(s.charAt(i)) , "0");
//			}
//		}
//		System.out.println(Integer.parseInt(s));

		
//		String s = "00111";
//		System.out.println(maxScore(s));
		
//		String[] words = {"abc","car","ada","racecar","cool"};
//		System.out.println(firstPalindrome(words));
		
		String sentence = "i am tired", searchWord = "you";
//		System.out.println("prakash".startsWith("prak"));
		System.out.println(isPrefixOfWord(sentence, searchWord));
	}

	private static int isPrefixOfWord(String sentence, String searchWord) {

		String[] stArr = sentence.split(" ");
		for (int i = 0; i < stArr.length; i++) {
			if(stArr[i].startsWith(searchWord)) {
				return i+1;
			}
		}
		return -1;
	}

	private static String firstPalindrome(String[] words) {

		for (String out : words) {
			String rev = "";
			for (int i = out.length()-1; i >= 0; i--) {
				rev += out.charAt(i);
			}
			if(out.equals(rev)) {
				return out;
			}
		}
		return "";
	}

	private static int maxScore(String s) {

		int max = 0, leftZero = 0, rightOnce = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == '0') {
				leftZero++;
			}else {
				rightOnce++;
			}
			max = Math.max(max, leftZero+rightOnce);
		}
		return max;
	}
}
