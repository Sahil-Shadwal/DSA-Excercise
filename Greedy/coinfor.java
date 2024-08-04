package Greedy;

import java.util.Arrays;

public class coinfor {
    public static int minCoin(int[] coins, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, target + 1); // Initialize with a large value
        dp[0] = 0; // Base case

        for (int coin : coins) {
            for (int i = coin; i <= target; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[target] > target ? -1 : dp[target]; // If dp[target] is still large, return -1 indicating no solution
    }

    public static void main(String[] args) {
        int coins[] = { 1, 3, 4, 5 };
        int V = 100;
        System.out.println("Minimum coins required: " + minCoin(coins, V));
    }
}