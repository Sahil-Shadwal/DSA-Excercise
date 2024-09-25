package Day15;

import java.util.*;

public class arithmetic {

    public static int AP(int n, int a, int d) {
        int result = 0;
        result = (n / 2) * (2 * a + (n - 1) * d);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(AP(n, a, d));

    }
}
