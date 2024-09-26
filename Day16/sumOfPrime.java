package Day16;

import java.util.*;

public class sumOfPrime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean canBeExpressedAsSumOfTwoPrimes(int N) {
        for (int i = 2; i <= N / 2; i++) {
            if (isPrime(i) && isPrime(N - i)) {
                System.out.println(N + "can be expressed as " + i + "+" + (N - i));
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();

        if (canBeExpressedAsSumOfTwoPrimes(N)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // System.out.println(isPrime(N));
    }
}
