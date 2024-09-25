package Day15;

import java.util.*;

public class geometric {
    // Method to calculate the nth term of a geometric progression
    public static double nthTerm(double a, double r, int n) {
        return a * Math.pow(r, n - 1);
    }

    // Method to calculate the sum of the first n terms of a geometric progression
    public static double sumOfTerms(double a, double r, int n) {
        if (r == 1) {
            return a * n;
        } else {
            return a * (1 - Math.pow(r, n)) / (1 - r);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the common ratio (r): ");
        double r = scanner.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double nthTerm = nthTerm(a, r, n);
        double sum = sumOfTerms(a, r, n);

        System.out.println("The " + n + "th term of the geometric progression is: " + nthTerm);
        System.out.println("The sum of the first " + n + " terms of the geometric progression is: " + sum);

        scanner.close();
    }
}