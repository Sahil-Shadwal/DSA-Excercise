package Day13;

import java.util.*;

public class RotateArray {
    public static int[] rotate(int arr[], int n, int k) {
        int newArr[] = new int[n];
        int j = 0;
        for (int i = k; i < n; i++) {
            newArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(rotate(arr, n, k)));

    }
}
