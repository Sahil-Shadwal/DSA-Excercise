package Day6;

import java.util.*;

public class StudentAlignment {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int B[] = new int[n];
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
            arr[i] = i + 1;
        }
        int ans = 0;
        while (true) {
            ans++;
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = arr[B[i] - 1];
            }
            if (Arrays.equals(ar, sortedArray(n))) {
                break;
            }
            arr = ar;
            System.out.print(Arrays.toString(ar));

        }
        System.out.println(ans);
    }

    private static int[] sortedArray(int n) {
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = i + 1;
        }
        return sorted;
    }
}

// 5
// 2 3 1 5 4
// [2, 3, 1, 5, 4][3, 1, 2, 4, 5][1, 2, 3, 5, 4][2, 3, 1, 4, 5][3, 1, 2, 5, 4]6