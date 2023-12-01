import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Array Row ");
        m = sc.nextInt();
        System.out.print("Array Column ");
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Array Elements");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
                
        System.out.println();
        
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
               System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
        // your code here
		int row = matrix.length;
        int col = matrix[0].length;
        int lastRowIndex = row-1;
        int lastColIndex = col-1;
        
        if(col == 1){
			for (int i = 0; i < col; i++){
			    for (int j = 0; j < row; j++ ){
			        System.out.print(matrix[j][i]+" ");
			    } 
			} 
		}
		
		if(row == 1){
			for (int i = 0; i < row; i++){
			    for (int j = 0; j < col; j++ ){
			        System.out.print(matrix[i][j]+" ");
			    } 
			} 
		}
        
        if(row > 1 && col > 1){
            for(int i = 0; i <= n-1; i++){
                System.out.print(matrix[0][i]+" ");
            }
        
            for(int i = 1; i <= lastRowIndex; i++){
                System.out.print(matrix[i][lastColIndex] + " ");
            }
        
            for (int i = matrix[lastRowIndex].length - 2; i >= 0; i--) {
                System.out.print(matrix[lastRowIndex][i] + " ");
            }
        
            for(int i = lastRowIndex-1; i > 0; i--){
                System.out.print(matrix[i][0]+" ");
            }
        
        }
		
    }
}
// 9 1
// 52 
// 40 
// 18 
// 27 
// 29 
// 86 
// 25 
// 86 
// 55 
