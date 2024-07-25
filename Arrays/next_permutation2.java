package Arrays;
import java.util.*;

public class next_permutation2 {
    public static List<List<Integer>> findPermutation(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;    
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> res) {
        if (start == nums.length) {
            res.add(arrayToList(nums));
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, res);
            swap(nums, start, i);
        }
    }
    
    private static List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }    
    public static void main(String args[]){
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = findPermutation(arr);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
