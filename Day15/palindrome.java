package Day15;

import java.util.*;

public class palindrome {
    public static boolean pali(int n) {
        int rev = 0;
        int dup = n;

        while (n > 0) {
            int temp = 0;
            temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        if (rev == dup) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pali(n));
    }
}
