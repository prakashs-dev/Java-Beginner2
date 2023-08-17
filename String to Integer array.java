import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> arrayGenerator(String s){
        /*
        
        input : 1
                1321,3213,424,124
        
        output : [1321 , 3213 ,  424 , 124]
        
        */
        
		ArrayList<Integer> ans = new ArrayList<>();
		String arr[] = s.split(",");
		for(int i = 0; i < arr.length; i++){
			String number = arr[i];
			int value = Integer.parseInt(number);			
			ans.add(value);
		}
		return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
    }
}
