package com.leetCode;

public class TimeConversion {

	public static void main(String[] args) {
//		Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
		String s = "03:05:45AM";
		System.out.println(timeConversion(s));
	}

	static String timeConversion(String s) {

		int h1 = (int)s.charAt(1) - '0';
	    int h2 = (int)s.charAt(0) - '0';
	    int hh = (h2 * 10 + h1 % 10);
	    StringBuffer sb = new StringBuffer();
//	    if the time is AM mode
	    if(s.charAt(8) == 'A') {
	    	if(hh == 12) {
	    		sb.append("00");
	    		for (int i = 2; i <= 7; i++) {
					sb.append(Character.toString(s.charAt(i)));
				}
	    	}else {
	    		for (int i = 0; i <= 7; i++) {
					sb.append(Character.toString(s.charAt(i)));
				}
	    	}
	    }else {
//	    	if the time is PM mode
	    	if(hh == 12) {
	    		sb.append("12");
	    		for (int i = 2; i <= 7; i++) {
					sb.append(Character.toString(s.charAt(i)));
				}
	    	}else {
	    		hh = hh+12;
	    		sb.append(hh);
	    		for (int i = 2; i <= 7; i++) {
					sb.append(Character.toString(s.charAt(i)));
				}
	    	}
	    }
	    return sb.toString();
	}
}
