package Day7;

import java.util.*;

public class FairSequence {
    public static int fun(int[] arr, int n) {
        int sum = 0;
        int toggle = arr[0] > 0 ? 0 : 1;

        for (int i = 0; i < n;) {
            int maxVal = Integer.MIN_VALUE;

            while (i < n && ((toggle == 0 && arr[i] > 0) || (toggle == 1 && arr[i] < 0))) {
                maxVal = Math.max(maxVal, arr[i]);
                i++;
            }

            sum += maxVal;
            toggle = 1 - toggle;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(fun(arr, n));
        scanner.close();

    }
}
