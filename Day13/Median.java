package Day13;

import java.util.*;

public class Median {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = arr.length;
        float median = 0;
        if (k % 2 == 0) {
            int sum = (arr[n / 2] + arr[n / 2 - 1]);
            median = sum / 2.0f;
            System.out.println(sum);

        } else {
            median = arr[n / 2];
        }
        System.out.println(median);

    }
}

// import java.io.*;
// import java.util.Arrays;
// class Test
// {
// static private void getMedian(int[] arr, int n)
// {
// Arrays.sort(arr);

// if (n % 2 == 0)
// {
// int ind1 = (n / 2) - 1;
// int ind2 = (n / 2);
// System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
// }
// else
// {
// System.out.print(arr[(n / 2)]);
// }
// }
// public static void main(String[] args)
// {
// int[] arr = {4, 7, 1, 2, 5, 6};
// int n = 6;
// System.out.print("The median of the array is: ");
// getMedian(arr, n);
// }
// }