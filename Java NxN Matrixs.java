import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Array Row ");
	    int n = sc.nextInt();
	    System.out.print("Enter Array Column ");
	    int m = sc.nextInt();
	    
	    int a[][] = new int[n][m];
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < m; j++){
	            a[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Before Transpose of Array ");
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < m; j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    int fr[][] = Main.Transpose(a,n,m);
	    
	    System.out.println("After Transpose of Array ");
	    
	    for(int i=0; i<n; i++){   
	        for(int j=0; j<m; j++){
                    System.out.print(fr[i][j] + " ");
                } 
            System.out.println("");
        }
	    
    }
    
    public static int[][] Transpose(int[][] trans, int n, int m){
        
        int res[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				res[j][i] = trans [i][j];
			}
		}
		return res;
    }
    
    
    
}
