import java.io.*;
import java.util.*;
public class Main {
    
    /*
    Ques :: You are given a string str that contains only lowercase alphabets.You have to form a string that contains the difference 
            of ASCII values of every two consecutive characters between those characters
    
    Input :: abecd
    Output :: a1b3e-2c1d
    
    */
  
  public static String solution(String str) {
    int n = str.length();
    String ans = "";
    for(int i = 0; i < n; i++){
		char f = str.charAt(i);
		if(i+1 < n){
			char s = str.charAt(i+1);
		    int diff = s-f;
		    ans = ans+(char)f+diff;
		}	    
	}
    return ans+str.charAt(n-1);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}