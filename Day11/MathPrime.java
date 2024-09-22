package Day11;

import java.util.*;

public class MathPrime {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static int findlcm(int arr[]) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];

        int newArr[] = new int[n - 1];
        for (int i = 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }

        int res = findlcm(newArr);
        System.out.println(res + min);

    }
}