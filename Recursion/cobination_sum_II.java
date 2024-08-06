package Recursion;

import java.util.*;

public class cobination_sum_II {
    public static List<List<Integer>> combination(int nums[], int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int nums[], int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                temp.add(nums[i]);
                backtrack(result, temp, nums, remain - nums[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String args[]) {
        // int nums[] = { 10, 1, 2, 7, 6, 1, 5 };
        int nums[] = { 2, 5, 2, 1, 2 };
        int target = 5;
        // int target = 8;
        List<List<Integer>> result = combination(nums, target);
        System.out.println(result);
    }
}
