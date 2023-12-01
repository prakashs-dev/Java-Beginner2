import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Test Case ");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Row ");
            int r = sc.nextInt();
            System.out.print("Column ");
            int c = sc.nextInt();
            System.out.println("Array Elements ");
            int matrix[][] = new int[r][c];
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            System.out.println();
             for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                 System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            ArrayList<Integer> ans = spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            
        }
    }

    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int row, int col){
        // your code here
		int sr = 0, sc = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(row > sr && col > sc){
            for(int i = sr; i < row; i++){
                list.add(matrix[i][sc]);
            }
            sr++;
			for(int j = sr; j < col; j++){
		        list.add(matrix[row-1][j]);
	        }
	        row--;   
			for(int i = row-1; i >= sc; i--){
	            list.add(matrix[i][col-1]);
	        }
	        col--;
			for(int j = col-1; j >= sr; j--){
	            list.add(matrix[sc][j]);
	        }
	        sc++;
        }
        return list;
		
    }
}