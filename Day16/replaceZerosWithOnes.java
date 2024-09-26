package Day16;

import java.util.*;

public class replaceZerosWithOnes {

    public static int replace(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        int temp = 1;
        while (n > 0) {

            int d = n % 10;
            if (d == 0) {
                d = 1;
            }
            ans = d * temp + ans;
            n = n / 10;
            temp = temp * 10;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(replace(n));
    }
}
