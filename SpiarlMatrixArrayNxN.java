import java.util.*;

class Accio{
    static int[] SpiralMatrix(int n, int[][] a){
        // write code here
        int res[] = new int[n*n];
	    int start_row = 0, end_row = n-1, start_cols = 0, end_cols = n-1;
	    int indx = 0;
	   
	   while(start_row <= end_row && start_cols <= end_cols){
	                    
	        for(int i = start_cols; i <= end_cols; i++){
	           res[indx++] = a[start_row][i];
	        }
	        start_row++;
	        
	        for(int i = start_row; i <= end_row; i++){
	           res[indx++] = a[i][end_cols];
	        }
	        end_cols--;
	        
	        if(start_row <= end_row){
	            for(int i = end_cols; i >= start_cols; i--){
	               res[indx++] = a[end_row][i];
	            }
	            end_row--;
	        }
	        
	        if(start_cols <= end_cols){
	            for(int i = end_row; i >= start_row; i--){
	               res[indx++] = a[i][start_cols];
	            }
	            start_cols++;
	        }
	   } 
	   return res;
	   
	   
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix Number ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        Accio obj = new Accio();
        int[] ans=obj.SpiralMatrix(n,matrix);
        System.out.println();
        for(int i=0;i<n*n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}