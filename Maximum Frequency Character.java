import java.util.*;

public class Main {
    /* 
    Question :: Given a string s containing lowercase alphabets, return the character with the highest occurrence in s.
    If there are multiple such characters, then return the lexicographically smallest one of them.
    
    Input :: aabbbccc
    Output :: b
    
    **/
    
     static char MaximumFrequencyChar(String s) {
        //Write your code here
		 int alphabet[] = new int[26];
		 char ch[] = s.toCharArray();
		 for(int i = 0; i < ch.length; i++){
			 alphabet[ch[i]-'a'] += 1;
		 }
		 char lexiSmall = 'a';
		 int countChar = -1;

		 for(int i = 0; i < alphabet.length; i++){
			 if(alphabet[i] > countChar){
				 countChar = alphabet[i];
				 lexiSmall = (char)('a'+i);
			 }
		 }
		 return lexiSmall;
		 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}