package Arrays;

import java.util.*;

public class twoosum {
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 11, 15, 3 };
        int ans[] = twoSum(arr, 18);
        System.out.println(Arrays.toString(ans));
    }
}
