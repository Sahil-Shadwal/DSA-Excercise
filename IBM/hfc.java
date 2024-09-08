package IBM;

import java.util.*;

public class hfc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two positive numbers separated by space:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // System.out.println("Enter the first positive number:");
        // int num1 = scanner.nextInt();

        // System.out.println("Enter the second positive number:");
        // int num2 = scanner.nextInt();

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int hcf = findHfc(num1, num2);
        System.out.println("HCF : " + hcf);

    }

    public static int findHfc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }
}