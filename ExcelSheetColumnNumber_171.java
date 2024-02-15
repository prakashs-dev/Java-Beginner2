package com.leetCode;

public class ExcelSheetColumnNumber_171 {

	public static void main(String[] args) {
		String columnTitle = "AB";
//		System.out.println(titleToNumber(columnTitle));
		int columnNumber = 701;
		System.out.println(convertToTitle(columnNumber));
	}

	 static String convertToTitle(int columnNumber) {

		StringBuffer sb = new StringBuffer();
		while (columnNumber > 0) {
			int last = (columnNumber - 1) % 26;
			sb.append(Character.toString((char) (65 + last)));
			columnNumber = (columnNumber - 1) / 26;
		}
		return sb.reverse().toString();
	}

	 static int titleToNumber(String str) {

		int pos = 0, res = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			res += (str.charAt(i) - 65 + 1) * Math.pow(26, pos);
			pos++;
		}
		return res;
	}

}
