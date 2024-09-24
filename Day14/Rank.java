package Day14;

import java.util.*;

public class Rank {
    public static void ranking(int arr[], int n) {
        int newArr[] = Arrays.copyOf(arr, n); // Create a copy of arr
        Arrays.sort(newArr);

        // Create a HashMap to store the rank of each element
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            // Only assign a rank if the element hasn't been ranked yet
            if (!rankMap.containsKey(newArr[i])) {
                rankMap.put(newArr[i], rank);
                rank++;
            }
        }

        // Print the rank of each element in the original array
        for (int i = 0; i < n; i++) {
            System.out.print(rankMap.get(arr[i]) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ranking(arr, n);
    }
}
