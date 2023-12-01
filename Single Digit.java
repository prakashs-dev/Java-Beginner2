import java.io.*;
import java.util.*;

class Solution{
    static int specialSum(ArrayList<Integer> arr, int n){
         //Write code here
         
         /*
         5
        8 7 0 1 2
        
        Explanation:

For the given array [8, 7, 0, 1, 2]

The sum of the elements of the array will be 8 + 7 + 0 + 1 + 2 = 18.

Since 18 is not a single-digit number, we will again take the sum of the digits of 18. 1 + 8 = 9.

Now 9 is a single-digit number. So we will stop here and return 9.
         
         */
        int sum = 0;
		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(i);
		}
		int ans = 0;
		while(sum > 0 || ans > 9){
			if(sum == 0){
				sum = ans;
				ans = 0;
			}
			ans += sum % 10;
			sum = sum / 10;
		}
		return ans;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.specialSum(arr,n);
        System.out.println(ans);
	}
}