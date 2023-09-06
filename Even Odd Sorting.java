import java.util.*;

public class Main {
    /*
    Question :: Implement Odd-Even sort /Brick sort.
    
    Input :: 6
             7 6 8 5 4 9
             
    Output :: 4 5 6 7 8 9
    **/
    static void oddEvenSort(int a[], int n)
    {
        //Write your code here
		boolean isSort = false;
		while(!isSort){
			isSort = true;
			for(int i = 0; i < n-1; i+=2){
				if(a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSort = false;
				}
			}
			for(int i = 1; i < n-1; i+=2){
				if(a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					isSort = false;
				}
			}
		}

		for(int j = 0; j < n; j++){
			System.out.print(a[j]+" ");
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        oddEvenSort(array,n);
    }
}