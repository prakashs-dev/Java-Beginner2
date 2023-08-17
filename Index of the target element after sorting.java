import java.io.*;
import java.util.*;

public class Main {
    /*
    Question :: You are given an array arr of length n. Your task is to print the index of the given target element after sorting the given array arr.
                Assume that the array contains only unique elements.
    
    Input :: 6
             6 27 2 3 1 5
             5
             
    Output :: 3
    
    **/
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Array Size
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt(); // target
		Arrays.sort(a);
		int index = -1;
		for(int i = 0; i < a.length; i++){
			if(a[i] == m){
				index = i;
				break;
			}
		}
		System.out.print(index);
    }
}