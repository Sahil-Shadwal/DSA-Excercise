package Day16;

import java.util.*;

public class fraction {

    public static int gcd(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return temp;
    }

    public static void addFractions(int num1, int den1, int num2, int den2) {
        int lcm = Math.abs(den1 * den2) / gcd(den1, den2);

        int newNum1 = (lcm / den1) * num1;
        int newNum2 = (lcm / den2) * num2;

        int result = newNum1 + newNum2;

        // simplifying it using gcd
        int commonDiviser = gcd(result, lcm);
        result /= commonDiviser;
        lcm /= commonDiviser;

        if (lcm == 1) {
            System.out.println(result);
        } else {
            System.out.println(result + "/" + lcm);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first fraction (e.g., 1/2)");
        String fraction1 = sc.nextLine();
        System.out.println("Enter the second fraction (e.g., 3/2)");
        String fraction2 = sc.nextLine();

        String[] parts1 = fraction1.split("/");
        String[] parts2 = fraction2.split("/");

        int num1 = Integer.parseInt(parts1[0]);
        int den1 = Integer.parseInt(parts1[1]);
        int num2 = Integer.parseInt(parts2[0]);
        int den2 = Integer.parseInt(parts2[1]);

        addFractions(num1, den1, num2, den2);
    }

}
