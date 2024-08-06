package Recursion;

import java.util.*;

public class subset_II {
    public static List<List<Integer>> subset(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int nums[], int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            backtrack(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 2 };
        List<List<Integer>> result = subset(nums);
        System.out.println(result);
    }
}
