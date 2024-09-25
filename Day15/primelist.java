package Day15;

import java.util.*;

public class primelist {
    public static List<Integer> prime(int start, int end) {
        List<Integer> l = new ArrayList<>();
        for (int i = start; i < end; i++) {

            if (i <= 1) {
                continue;
            }
            if (i == 2 || i == 3) {
                l.add(i);
                continue;
            }
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 5; j * j <= i; j += 6) {
                if (i % j == 0 || i % (j + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(prime(s, e));
    }
}