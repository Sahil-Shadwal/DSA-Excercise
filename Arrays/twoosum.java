package Arrays;

import java.util.*;

public class twoosum {
    // public static int[] twoSum(int arr[], int target) {
    public static List<int[]> twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                result.add(new int[] { map.get(complement), i });
                // return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        // return new int[] {};
        return result;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 11, 15, 3 };
        // int ans[] = twoSum(arr, 18);
        // System.out.println(Arrays.toString(ans));
        List<int[]> ans = twoSum(arr, 18);
        for (int[] pair : ans) {
            System.out.println(Arrays.toString(pair));
        }

    }
}
