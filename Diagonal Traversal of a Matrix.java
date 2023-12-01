import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Array Elements ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        // sc.close();
        System.out.println();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = n-1; i >= -(n-1);i--){
            if(i >= 0){
                int row = 0;
                int col = i;
                while(row < n && col < n){
                    ans.add(mat[row][col]);
                    row++;
                    col++;
                }
            }else{
                int row = -i;
                int col = 0;
                while(row < n && col < n){
                    ans.add(mat[row][col]);
                    row++;
                    col++;
                }
            }
            
        }
        return ans;
		
    }
}