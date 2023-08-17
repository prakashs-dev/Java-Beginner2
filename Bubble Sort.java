import java.util.*;
public class Main
{
	public static void main(String[] args) {
    // Bubble sort
        int arr[] = {3,1,4,6,2,1,3,5};		
	    int n = arr.length;
	
	    bubbleSort(arr,n);
		
	    for(int i = 0; i < n; i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	
	static void bubbleSort(int a[], int len){
	    /*
	    TC : O(N^2)
	    SC : O(1)
	    */
	    for(int i = 0; i < len; i++){
	        for (int j = 0; j < len-i-1; j++){
	            
	            if(a[j] > a[j+1]){
	                int temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	            }
	        } 
	    }
	}
}
