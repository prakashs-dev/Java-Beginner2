import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int a[][] = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	    int row = a.length;
	    int col = a[0].length;
	    
	    for(int i = 0; i < row; i++){
	        for(int j = 0; j < col; j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	   System.out.println();
	   System.out.println("After Sprial Matrix ");  
	   System.out.println();
	   int sr = 0, er = row-1, sc = 0, ec = col-1;
	   
	   while(sr <= er && sc <= ec){
	                    
	    for(int x = sr; x <= ec; x++){
	        System.out.print(a[sr][x]+" ");
	    }
	    sr++;
	    
	    for(int x = sr; x <= er; x++){
	        System.out.print(a[x][ec]+" ");
	    }
	    ec--;
	    
	    if(sr <= ec){
	        for(int x = ec; x >= sc; x--){
	            System.out.print(a[er][x]+" ");
	        }
	    }
	    er--;
	    
	    if(sc <= ec){
	        for(int x = er; x >= sr; x--){
	            System.out.print(a[x][sc]+" ");
	        }
	    }
	    sc++;
	    
	   // for(int x = sr; x <= ec; x++){
	   //     System.out.print(a[sr][x]+" ");
	   // }
	   // sr++;
	    
	   // for(int x = sr; x < ec; x++){
	   //     System.out.print(a[x][ec]+" ");
	   // }
	   // ec--;
	    
	   //System.out.println("sr "+sr+"sc "+sc+"er "+er+"ec "+ec);
	   //if(sr <= er){
	   //    for(int x = er; x >= sc; x--){
	   //         System.out.print(a[sr][x]+" ");   
	   //    }
	   //}
	    
	   } 
	    
	    
	    
	    
	    
	    
	}
}
