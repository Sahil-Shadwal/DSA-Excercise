package Day13;

import java.util.*;

public class Duplicates {
    public static int[] remove(int arr[], int n) {
        int newArr[] = new int[n];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] != arr[i - 1]) {
                newArr[i - 1] = arr[i - 1];
            }
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
        System.out.println(Arrays.toString(remove(arr, n)));

    }
}
