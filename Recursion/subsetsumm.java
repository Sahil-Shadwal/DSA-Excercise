package Recursion;

import java.util.*;

public class subsetsumm {
    public static void subsetSum(int arr[], int index, int currentSum, List<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        subsetSum(arr, index + 1, currentSum + arr[index], result);
        subsetSum(arr, index + 1, currentSum, result);

    }

    public static void main(String args[]) {
        // int arr[] = { 2, 3 };
        int arr[] = { 5, 2, 1 };
        List<Integer> result = new ArrayList<>();
        subsetSum(arr, 0, 0, result);

        Integer[] resultArray = result.toArray(new Integer[0]);
        Arrays.sort(resultArray);

        for (int sum : resultArray) {
            System.out.print(sum + " ");
        }
    }
}
