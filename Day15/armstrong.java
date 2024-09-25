package Day15;

import java.util.*;

public class armstrong {
    public static boolean checkArm(int n) {
        int check = n;
        int d = 0;
        while (n > 0) {
            int temp = n % 10;
            d = (temp * temp * temp) + d;
            n = n / 10;

        }
        if (d == check) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkArm(n));
    }

}
