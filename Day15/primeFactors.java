package Day15;

import java.util.*;

public class primeFactors {
    public static List<Integer> factors(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                l.add(i);
            }
            while (n % i == 0) {
                n = n / i;
            }
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factors(n));
    }
}
