import java.io.*;
import java.util.*;

public class Main {
    
    /*
    Question :: Given an integer array arr[] in unsorted order. Using Bubble Sort Technique, return an array of the squares of each number sorted in 
                non-decreasing order.
    Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
    
    Input :: 5
            -4 -1 0 3 10
            
    Output :: 0 1 9 16 100
    */
    
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int ans[] = bubbleSort(a,n);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i]+" ");
		}
    }
	static int[] bubbleSort(int arr[], int n){
		for(int i = 0; i < n; i++){
			arr[i] = (int)Math.pow(arr[i],2);
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;	
	}
}