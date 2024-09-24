package Day14;

import java.util.*;

public class Eqillibirium {
    public static void equi(int arr[], int n) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            right = right + arr[i];
        }

        for (int i = 0; i < n; i++) {
            right = right - arr[i];
            if (left == right) {
                System.out.print(i + 1);
            }
            left = left + arr[i];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        equi(arr, n);
    }
}
