import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int[] findSum(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int maxLength = Math.max(N, M);

        List<Integer> result = new ArrayList<>();
        int carry = 0;

        for (int i = 0; i < maxLength || carry != 0; i++) {
            int digitA = (i < N) ? A[N - i - 1] : 0;
            int digitB = (i < M) ? B[M - i - 1] : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }

        Collections.reverse(result);

        // Convert ArrayList to an array
        int[] sumArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sumArray[i] = result.get(i);
        }

        return sumArray;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3 }; // Replace this with your array A
        int[] B = { 4, 5, 6, 7 }; // Replace this with your array B

        int[] sum = findSum(A, B);

        System.out.print("Sum of A and B is: ");
        for (int digit : sum) {
            System.out.print(digit + " ");
        }
    }
}
