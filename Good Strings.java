import java.util.*;

public class Main {

  static int goodStrings(String s, String[] A, int n) {
    // your code here
	  int count = 0;
	  for(String str : A){
		  boolean isPresent = true;
		  int index = 0;
		  for(int i = 0; i < str.length(); i++){
			  char ch = str.charAt(i);
			  if(!s.contains(String.valueOf(ch))){
				  isPresent = false;
				  break;
			  }
		  }
		  if(isPresent ){
			  count++;
		  }
	  }
	  return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}