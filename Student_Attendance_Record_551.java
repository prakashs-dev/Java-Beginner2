package com.leetCode;

public class Student_Attendance_Record_551 {

	public static void main(String[] args) {
		String s = "LALL";
		System.out.println(checkRecord(s));
	}

	private static boolean checkRecord(String s) {
		// TODO Auto-generated method stub
		int countAbs = 0;
		int countLate = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countAbs++;
				countLate = 0;
				if (countAbs >= 2) {
					return false;
				}
			} else if (s.charAt(i) == 'L') {
				countLate++;
				if (countLate >= 3) {
					return false;
				}
			} else {
				countLate = 0;
			}
		}
		return true;
	}
}
