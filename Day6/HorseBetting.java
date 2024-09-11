package Day6;

import java.util.*;

public class HorseBetting {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int bets[] = new int[N];

        for (int i = 0; i < N; i++) {
            bets[i] = scanner.nextInt();
        }

        getBets(N, K, bets);
    }

    public static void getBets(int N, int K, int bets[]) {
        int start = 0, sum = 0, maxLength = 0;

        for (int end = 0; end < N; end++) {
            sum += bets[end];

            while (sum >= K && start <= end) {
                sum -= bets[start];
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println(maxLength);
    }
}