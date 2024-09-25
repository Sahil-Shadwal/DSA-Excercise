package Day15;

import java.util.*;

public class reverse {
    public static int reverseNo(int n) {
        int result = 0;
        while (n > 0) {
            int curr = n % 10;
            result = result * 10 + curr;
            n = n / 10;

        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNo(n));
    }
}
