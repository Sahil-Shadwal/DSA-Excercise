package Day11;

import java.util.*;

public class Vaccine {
    public static int helpMLA(int arr[], int m1, int m2) {
        Arrays.sort(arr);
        int time1 = 0, time2 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (time1 <= time2) {
                time1 += arr[i] * m1;
            } else {
                time2 += arr[i] * m2;
            }
        }
        return Math.max(time1, time2);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int number = sc.nextInt();
        int arr[] = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        int result = helpMLA(arr, m1, m2);
        System.out.println(result);
    }
}
