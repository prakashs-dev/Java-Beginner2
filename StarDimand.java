import java.util.*;

class Solution {
    public void pattern(int n) {
        // your code here
        System.out.println();
        
        // First Half
        for(int i = 0 ;  i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Secound Half
        
        for(int i = n ;  i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        Solution solution = new Solution();
        solution.pattern(n);
    }
}