import java.util.*;

class Solution{
    /*
    Ques ::  Write a program to sort a given matrix mat[][] of dimensions N*M (row and column) in column wise order.
            Your task is to sort each column of a matrix in ascending order and finally print the updated matrix/2D Array.
            
    Input :: 3 5
            9 7 8 11 21
            1 4 3 7 2
            4 3 14 9 12
            
    Output :: 1 3 3 7 2 
              4 4 8 9 12 
              9 7 14 11 21 
    
    **/
    
    static int[][] transpose(int[][] mat){
        int res[][] = new int[mat[0].length][mat.length];
        
        for(int i = 0; i < res[0].length; i++){
            for(int j = 0; j < res.length; j++){
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }

    public static void sortCol(int[][] mat, int N, int M){
        // Write your code and print here
        int[][] trans = transpose(mat);
        
        for(int i = 0; i < M; i++){
            Arrays.sort(trans[i]);
        }
        mat = transpose(trans);
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

public class Main {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
         System.out.print("Array Row ");
          int n=sc.nextInt();
          System.out.print("Array Column ");
          int m=sc.nextInt();
          System.out.println("Array Elements ");
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          System.out.println();
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
          }
          System.out.println();
          Solution.sortCol(mat, n, m);
      
        }
}