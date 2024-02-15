package com.interview;

public class Try_Catch_Final {

	public static int test(int len) {
		return len;

	}
	
	public static void main(String[] args){

		try { 
			String s = null;
			test(s.length());
		}catch (NullPointerException e) {
			System.out.println(e);
		}catch (Exception n) {
			System.out.println(n);
		}
		finally {
			System.out.println("DONE");
		}
		
	
	
	}
}
