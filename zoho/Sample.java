package com.zoho;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a1b2c3d4e";
		String num = "";
		char letter = ' ';
		StringBuffer sb = new StringBuffer();
		for (char ch : s.toCharArray()) {
			if(!(ch >= '0' && ch <= '9')) {
				if(num != "") {
					int n = Integer.parseInt(num);
					for (int i = 1; i <= n; i++) {
						sb.append(letter);
					}
				}
				letter = ch;
				num = "";
			}else {
				num += ch;
			}
		}
		int n = Integer.parseInt(num);
		for (int i = 1; i <= n; i++) {
			sb.append(letter);
		}
		System.out.println(sb);
	}
}
