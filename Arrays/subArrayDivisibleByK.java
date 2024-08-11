package Arrays;

import java.util.*;

public class subArrayDivisibleByK {
    public static int arraysDivByk(int nums[], int K) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            int remainder = sum % K;
            if (remainder < 0) {
                remainder += K;
            }
            count += map.getOrDefault(remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 0, -2, -3, 1 };
        int result = arraysDivByk(nums, 5);
        System.out.println(result);
    }
}
