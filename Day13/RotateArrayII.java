package Day13;

import java.util.*;

public class RotateArrayII {
    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n
        if (k == 0)
            return;
        blockSwap(arr, 0, k, n);
    }

    private static void blockSwap(int arr[], int start, int k, int n) {
        if (k == 0 || k == n)
            return;
        if (n - k == k) {
            swap(arr, start, n - k + start, k);
            return;
        }
        if (k < n - k) {
            swap(arr, start, n - k + start, k);
            blockSwap(arr, start, k, n - k);
        } else {
            swap(arr, start, k, n - k);
            blockSwap(arr, n - k + start, 2 * k - n, k);
        }
    }

    private static void swap(int arr[], int start1, int start2, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}