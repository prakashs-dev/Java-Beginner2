import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Test Case ");
        int t = sc.nextInt();
        System.out.print("Enter 1st & 2nd Array ");
		while(t-- > 0)
		{
        int n;
        n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        //matrix1
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        //matrix2
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
                System.out.println("After Matrix");
        printMultiplication(matrix1,matrix2,n);
		}
	    
	}
	
	 public static void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output
        // int len = matrix1.length;
        // int m = ma
        int res[][] = new int[n][n];
        int sum = 0 ;
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length; j++){
                for(int k = 0; k < matrix1.length; k++){
                    res[i][j] +=  (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
	
}
