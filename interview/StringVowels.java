package com.interview;

public class StringVowels {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java Class";
		boolean res = s.trim().matches(".*[AaEeIiOoUu].*");
		
		if (res) {
			System.out.println("Vowels are Present");
		}else {
			System.out.println("Vowels not Present");
		}
		
		/* Find 5 mistakes in the following code snippet.
		
		package com.digitalocean.programming-interviews;
		public class String Programs {
			static void main(String[10] args) {
				String s = "abc"
				System.out.println(s);
			}
		} */
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		System.out.println("s1 == s2 ? " + (s1 == s2)); //true
		System.out.println("s1 == s3 ? " + (s1 == s3)); //false
		System.out.println("s1 equals s3 ? " + (s1.equals(s3))); //true
		
		
	}
}
