package Greedy;

import java.util.HashMap;
import java.util.Map;

public class coin {
    public static int minCoin(int arr[], int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        int result = minCoinHelper(arr, target, memo);
        System.out.println("Memoization Map: " + memo);
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
                min = Math.min(min, subResult + 1);
            }
        }

        memo.put(target, min);
        return min;
    }

    public static void main(String[] args) {
        int coins[] = { 25, 10, 5 };
        int V = 30;
        System.out.println("Minimum coins required: " + minCoin(coins, V));

        int coins2[] = { 9, 6, 5, 1 };
        int V2 = 11;
        System.out.println("Minimum coins required: " + minCoin(coins2, V2));
    }
}

// Step-by-Step Breakdown
// Initial Call:

// minCoinHelper(arr, 30, memo) is called.
// memo is empty at this point.
// First Level of Recursion:

// The function iterates over the coins.
// For coin = 25, it calls minCoinHelper(arr, 30 - 25, memo) which is
// minCoinHelper(arr, 5, memo).
// Second Level of Recursion:

// For coin = 5, it calls minCoinHelper(arr, 5 - 5, memo) which is
// minCoinHelper(arr, 0, memo).
// Since target = 0, it returns 0.
// memo now contains {5: 1} because 5 can be made with one coin of 5.
// Back to First Level:

// For coin = 10, it calls minCoinHelper(arr, 30 - 10, memo) which is
// minCoinHelper(arr, 20, memo).
// Third Level of Recursion:

// For coin = 10, it calls minCoinHelper(arr, 20 - 10, memo) which is
// minCoinHelper(arr, 10, memo).
// For coin = 10, it calls minCoinHelper(arr, 10 - 10, memo) which is
// minCoinHelper(arr, 0, memo).
// Since target = 0, it returns 0.
// memo now contains {5: 1, 10: 1} because 10 can be made with one coin of 10.
// Back to Third Level:

// For coin = 5, it calls minCoinHelper(arr, 20 - 5, memo) which is
// minCoinHelper(arr, 15, memo).
// Fourth Level of Recursion:

// For coin = 10, it calls minCoinHelper(arr, 15 - 10, memo) which is
// minCoinHelper(arr, 5, memo).
// Since 5 is already in memo, it returns 1.
// memo now contains {5: 1, 10: 1, 15: 2} because 15 can be made with one coin
// of 10 and one coin of 5.
// Back to Third Level:

// For coin = 5, it calls minCoinHelper(arr, 20 - 5, memo) which is
// minCoinHelper(arr, 15, memo) again.
// Since 15 is already in memo, it returns 2.
// Back to First Level:

// For coin = 5, it calls minCoinHelper(arr, 30 - 5, memo) which is
// minCoinHelper(arr, 25, memo).
// Fifth Level of Recursion:

// For coin = 25, it calls minCoinHelper(arr, 25 - 25, memo) which is
// minCoinHelper(arr, 0, memo).
// Since target = 0, it returns 0.
// memo now contains {5: 1, 10: 1, 15: 2, 25: 1} because 25 can be made with one
// coin of 25.
// Back to Fifth Level:

// For coin = 10, it calls minCoinHelper(arr, 25 - 10, memo) which is
// minCoinHelper(arr, 15, memo) again.
// Since 15 is already in memo, it returns 2.