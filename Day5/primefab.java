import java.util.Scanner;

public class primefab {

    // Function to generate the first N Fibonacci numbers
    public static int[] generateFibonacci(int N) {
        int[] fibonacci = new int[N];
        fibonacci[0] = 1;
        if (N > 1) {
            fibonacci[1] = 2;
        }
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to generate the first N prime numbers
    public static int[] generatePrimes(int N) {
        int[] primes = new int[N];
        int count = 0;
        int num = 2;
        while (count < N) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[] fibonacci = generateFibonacci((N + 1) / 2);
        int[] primes = generatePrimes(N / 2 + 1);

        int[] series = new int[N];
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                series[i] = fibonacci[i / 2];
            } else {
                series[i] = primes[i / 2];
            }
        }

        System.out.println(series[N - 1]);
    }
}