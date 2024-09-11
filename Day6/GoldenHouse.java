package Day6;

import java.util.*;

public class GoldenHouse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        findRooms(N, K, coins);
    }

    private static void findRooms(int N, int K, int[] coins) {
        int start = 0, end = 0, currentSum = 0;
        while (end < N) {
            currentSum += coins[end];

            while (currentSum > K && start <= end) {
                currentSum -= coins[start];
                start++;
            }

            if (currentSum == K) {
                System.out.println((start + 1) + " " + (end + 1));
                return;
            }

            end++;
        }
    }
}
