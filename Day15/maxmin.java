package Day15;

import java.util.*;

public class maxmin {
    public static void maximini(int n) {
        int mini = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (n > 0) {
            int temp = n % 10;
            mini = Math.min(temp, mini);
            max = Math.max(temp, max);

        }
        System.out.println(max + " " + mini);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maximini(n);
    }
}
