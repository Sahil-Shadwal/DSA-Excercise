package Day8;

import java.util.*;

public class Reeval {

    public static int eval(int arr[]) {
        int count = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count--;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int reval = sc.nextInt();
        int arr[] = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < reval; i++) {
            int index = sc.nextInt();
            int val = sc.nextInt();
            for (int j = 0; j < total; j++) {
                if (j == index) {
                    arr[j] = val;
                }
            }
        }
        System.out.println(eval(arr));
    }
}
