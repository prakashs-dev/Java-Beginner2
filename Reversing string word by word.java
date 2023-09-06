import java.io.*;
import java.util.*;

public class Main {
    /*
    Question :: Print the string A after reversing the string word by word.
    Input :: the sky is blue
    Output :: blue is sky the
    
    **/
	public static void main(String args[]) {
		// your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String a[] = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = a.length-1; i >= 0; i--){
			sb.append(a[i]);
			if(i > 0) {
				sb.append(" ");
			}
		}
		System.out.print(sb);
	}
}