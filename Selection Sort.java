import java.util.*;

public class Main {
    /*
       Question ::  Given an array arr of size n, containing positive integers. You need to sort the elements of array using 
        the Selection Sort algorithm
        
        Input :: 5
                4 1 3 9 7
                
        Output :: 1 3 4 7 9
    
    */
    public static int[] SelectionSort(int[] arr) {
        // Write your code here
		int n = arr.length;
		for(int i = 1; i <= n-1; i++){
			int minEle = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j = i-1; j <= n-1; j++){
				if(arr[j] < minEle){
					minEle = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i-1];
			arr[i-1] = temp;
		}
		return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}