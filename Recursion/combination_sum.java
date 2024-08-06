package Recursion;

import java.util.*;

public class combination_sum {
    public static List<List<Integer>> combination(int nums[], int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(result, temp, nums, remain - nums[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = { 2, 3, 6, 7 };
        List<List<Integer>> result = combination(nums, 7);
        System.out.println(result);
    }
}
