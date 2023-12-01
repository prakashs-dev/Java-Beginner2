import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] ans = sumArrayExpectSelf(arr, n);

        for (int a : ans)
            System.out.print(a + " ");
    }

    public static int[] sumArrayExpectSelf(int[] a, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] != a[j]) {
                    sum += a[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
