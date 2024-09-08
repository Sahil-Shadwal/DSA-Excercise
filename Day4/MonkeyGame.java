package Day4;

import java.util.*;

public class MonkeyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int ateBanana = 0, atePeanut = 0;

        if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("Invalid Input");
        } else {
            if (k > 0) {
                ateBanana = m / k;
                m = m % k;
            }
            if (j > 0) {
                atePeanut = p / j;
                p = p % j;
            }
            n = n - ateBanana - atePeanut;
            if ((m != 0) || p != 0) {
                n = n - 1;
            }
            System.out.println("Number of Minkeys left on the Tree: " + n);
        }
    }
}
