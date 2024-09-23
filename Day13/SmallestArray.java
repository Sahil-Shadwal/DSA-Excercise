package Day13;

import java.util.*;

public class SmallestArray {
    public static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[0];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sort(arr));
    }
}
