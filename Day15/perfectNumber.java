package Day15;

import java.util.*;

public class perfectNumber {
    public static boolean perfect(int n) {
        int check = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
            if (sum == check) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(perfect(n));
    }
}
