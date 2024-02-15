package com.leetCode;

public class problem2129 {
	
	public static void main(String[] args) {
		
		String str = "i lOve leetcode";
		String ans = capitalizeTitle(str); 
		System.out.println(ans);
	}

	private static String capitalizeTitle(String str) {

		String st[] = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < st.length; i++) {
			String word = st[i];
			word = word.toLowerCase();
			if(word.length() != 1 && word.length() != 2) {
				char first = word.charAt(0);
				if(first >= 'a' && first <= 'z') {
					word = word.substring(0, 1).toUpperCase()+word.substring(1);
				}
				sb.append(word+" ");
			}else {
				sb.append(word+" ");
			}
		}
		return sb.toString().trim();
	}
}
