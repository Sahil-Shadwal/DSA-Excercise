package Greedy;

import java.util.HashMap;
import java.util.Map;

public class coin {
    public static int minCoin(int arr[], int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        int result = minCoinHelper(arr, target, memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private static int minCoinHelper(int arr[], int target, Map<Integer, Integer> memo) {
        if (target == 0) {
            return 0;
        }
        if (memo.containsKey(target)) {
            return memo.get(target);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                int subResult = minCoinHelper(arr, target - arr[i], memo);
                if (subResult != Integer.MAX_VALUE) {
                    min = Math.min(min, subResult + 1);
                }
            }
        }

        memo.put(target, min);
        return min;
    }

    public static void main(String[] args) {
        int coins[] = { 25, 10, 5 };
        int V = 30;
        System.out.println("Minimum coins required: " + minCoin(coins, V)); // Output: 2

        int coins2[] = { 9, 6, 5, 1 };
        int V2 = 11;
        System.out.println("Minimum coins required: " + minCoin(coins2, V2)); // Output: 2
    }
}