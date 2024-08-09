package Recursion;

import Arrays.majorutyElementII;

public class power {
    public static double mypow(double base, long power) {
        double ans = 1.0;
        long nTemp = power;

        if (power < 0) {
            nTemp = nTemp * (-1);
        }
        while (nTemp > 0) {
            if (nTemp % 2 == 0) {
                base *= base;
                nTemp /= 2;
            } else {
                ans = ans * base;
                nTemp--;
            }
        }
        return power < 0 ? 1 / ans : ans;
    }

    public static void main(String args[]) {
        double base = 2.0000;
        long power = 10;
        System.out.println();
        System.out.printf("%.8f%n", mypow(base, power));
        System.out.println();
        System.out.print(mypow(base, power));
    }
}
