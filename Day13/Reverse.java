package Day13;

import java.util.*;

public class Reverse {
    public static int[] reverseArr(int arr[]) {
        int newArr[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[j];
            j--;
        }
        return newArr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newArr[] = reverseArr(arr);

        System.out.println(Arrays.toString(newArr));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}