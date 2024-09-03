package Day2;

import java.util.*;

public class CruiseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hours (T): ");
        int t = sc.nextInt();

        int e[] = new int[t];
        int l[] = new int[t];

        System.out.println("Enter the number of guests entering each hour (E[]): ");
        for (int i = 0; i < t; i++) {
            System.out.printf("Hour %d entry: ", i + 1);
            e[i] = sc.nextInt();
        }

        System.out.println("Enter the number of guests leaving each hour (L[]): ");
        for (int i = 0; i < t; i++) {
            System.out.printf("Hour %d exit: ", i + 1);
            l[i] = sc.nextInt();
        }

        int max = 0, sum = 0;
        for (int i = 0; i < t; i++) {
            sum += e[i] - l[i];
            max = Math.max(sum, max);
        }

        System.out.println("Maximum number of guests on the cruise at any instance: " + max);
    }
}