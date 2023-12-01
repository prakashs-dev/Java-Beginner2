import java.io.*;
import java.util.*;

class Solution{
    static boolean special(int matrix[][], int n){
         //Write code here
        // left and Right diagonal
        int flag = 0, flag1 = 0, flag2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                if(i == j){
                    if(matrix[i][j] != 0)
                        flag++;
                }
                
                if((i+j) == (n-1)){
                    if(matrix[i][j] != 0)
                        flag1++;
                }
                
                //non diagonal elements
                if((i+j) < n-1){
                    if(i < j && i != j && (i+j) > 0){
                        flag2 += matrix[i][j];
                    }else if(i != j){
                        flag2 += matrix[i][j];
                    }
                }else{
                    if(i > j && (i+j) != n-1){
                        flag2 += matrix[i][j];
                    }else if((i+j) != n-1 && i != j){
                        flag2 += matrix[i][j];
                    }
                }
                
            }
        }
        
        return (flag != 0 && flag1 != 0 && flag2 == 0) ? true : false;
        
    }
}
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Test case ");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Array Size ");
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            System.out.println("Array Elements");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                 matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println();
            
             for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                 System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println();
            System.out.println(ans);
        }
    }
}