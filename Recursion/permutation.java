package Recursion;

import java.util.*;

public class permutation {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k--; // convert k to zero-indexed
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }

        StringBuilder result = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorial;
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial;
            if (i != 0) {
                factorial /= i;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        permutation ps = new permutation();
        System.out.println(ps.getPermutation(3, 3)); // Output: "213"
        System.out.println(ps.getPermutation(4, 9)); // Output: "2314"
        System.out.println(ps.getPermutation(3, 1)); // Output: "123"
    }
}