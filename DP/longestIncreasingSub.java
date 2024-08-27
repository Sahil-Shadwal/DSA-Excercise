package DP;

public class longestIncreasingSub {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 1;

        // Initialize all elements to 1 as each number is an LIS of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build the solution bottom-up
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        longestIncreasingSub lis = new longestIncreasingSub();

        // Test case 1
        int[] nums1 = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println("Length of LIS for [10,9,2,5,3,7,101,18]: " + lis.lengthOfLIS(nums1));

        // Test case 2
        int[] nums2 = { 0, 1, 0, 3, 2, 3 };
        System.out.println("Length of LIS for [0,1,0,3,2,3]: " + lis.lengthOfLIS(nums2));

        // Test case 3
        int[] nums3 = { 7, 7, 7, 7, 7, 7, 7 };
        System.out.println("Length of LIS for [7,7,7,7,7,7,7]: " + lis.lengthOfLIS(nums3));
    }
}
