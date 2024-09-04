package Day3;

import java.util.*;

public class CandyJar {
    public static void main(String[] args) {
        int n = 10, k = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of candies you wanna buy: ");

        int num = sc.nextInt();
        if (num >= 1 && num <= 5) {
            System.out.println("Number of candies sole is : " + num);
            System.out.print("Number of candies that are left : " + (n - num));
        } else {
            System.out.println("Invalid output");
            System.out.print("Number of candies left : " + n);
        }
    }
}
