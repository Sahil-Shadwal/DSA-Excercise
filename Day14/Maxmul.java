package Day14;

import java.util.*;

public class Maxmul {
    public static int maxproduct(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int curr = 1;
        for (int i = 0; i < n; i++) {
            curr = 1;

            for (int j = i; j < n; j++) {
                curr = curr * arr[j];
                if (max < curr) {
                    max = curr;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxproduct(arr, n));
    }
}
