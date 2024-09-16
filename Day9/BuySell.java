package Day9;

import java.util.*;

public class BuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();
        int rice = sc.nextInt();
        int cust[][] = new int[customer][2];
        for (int i = 0; i < customer; i++) {
            cust[i][0] = sc.nextInt();
            cust[i][1] = sc.nextInt();
        }
        int bags[][] = new int[rice][2];
        for (int i = 0; i < rice; i++) {
            bags[i][0] = sc.nextInt();
            bags[i][1] = sc.nextInt();
        }

        Arrays.sort(cust, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(bags, (a, b) -> Integer.compare(a[0], b[0]));
        int[] count = new int[rice];

        int ans = 0;
        for (int i = 0; i < customer; i++) {
            int quan = -1;
            int index = -1;
            for (int j = 0; j < rice; j++) {
                if (count[j] == 0) {
                    if (bags[j][0] > cust[j][0]) {
                        break;
                    }
                    if (bags[j][1] > cust[j][1]) {
                        if (quan == -1) {
                            quan = bags[j][1];
                            index = j;
                        } else {
                            if (quan > bags[j][1]) {
                                index = j;
                                quan = bags[j][1];
                            }
                        }
                    }
                }
            }
            if (index != -1) {
                count[index] = 1;
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
