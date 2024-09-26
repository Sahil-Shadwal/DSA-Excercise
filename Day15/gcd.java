package Day15;

import java.util.*;

public class gcd {
    public static int diviser(int a, int b) {
        // List<Integer> l = new ArrayList<>();
        int temp = b;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return temp;

    }

    public static int lcm(int a, int b) {
        int result = Math.abs(a * b) / diviser(a, b);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(diviser(a, b));
        System.out.println(lcm(a, b));

    }
}
