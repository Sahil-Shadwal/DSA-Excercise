package Day15;

import java.util.*;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        while (n > 0) {
            temp = temp * n;
            n--;
        }
        System.out.print(temp);
    }
}
