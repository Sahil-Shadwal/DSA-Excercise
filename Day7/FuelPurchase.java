package Day7;

import java.util.*;

public class FuelPurchase {
    public static int getMaxVolume(int N, int K, int[] prices, int[] volumes) {
        int dp[][] = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (prices[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - prices[i - 1]] + volumes[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][K];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int prices[] = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt();
        }
        int volumes[] = new int[N];
        for (int i = 0; i < N; i++) {
            volumes[i] = scanner.nextInt();
        }

        int maxVolume = getMaxVolume(N, K, prices, volumes);
        System.out.println(maxVolume);
        scanner.close();
    }
}

// public static int getMaxVolume(int money, int[] price, int[] volume, int n) {
// int[][] K = new int[n + 1][money + 1];

// for (int i = 0; i <= n; i++) {
// for (int m = 0; m <= money; m++) {
// if (i == 0 || m == 0) {
// K[i][m] = 0;
// } else if (price[i - 1] <= m) {
// K[i][m] = Math.max(volume[i - 1] + K[i - 1][m - price[i - 1]], K[i - 1][m]);
// } else {
// K[i][m] = K[i - 1][m];
// }
// }
// }
// return K[n][money];
// }