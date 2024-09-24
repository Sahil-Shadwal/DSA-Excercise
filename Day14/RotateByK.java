package Day14;

import java.util.*;

public class RotateByK {
    public static int[] rotate(int arr[], int n, String s, int st) {
        int[] newArr = new int[n];
        st = st % n; // Handle cases where st > n

        if (s.equals("right")) {
            // Right rotate: Shift last 'st' elements to the front
            for (int i = 0; i < st; i++) {
                newArr[i] = arr[n - st + i]; // Move last 'st' elements to the front
            }
            for (int i = st; i < n; i++) {
                newArr[i] = arr[i - st]; // Shift remaining elements
            }
        } else if (s.equals("left")) {
            // Left rotate: Shift first 'st' elements to the end
            for (int i = 0; i < n - st; i++) {
                newArr[i] = arr[st + i]; // Shift remaining elements to the left
            }
            for (int i = n - st; i < n; i++) {
                newArr[i] = arr[i - (n - st)]; // Move first 'st' elements to the end
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
        sc.nextLine(); // Consume newline after integer input
        String s = sc.nextLine(); // Read the direction "right" or "left"
        int st = sc.nextInt(); // Number of steps to rotate

        System.out.println(Arrays.toString(rotate(arr, n, s, st)));
    }
}
