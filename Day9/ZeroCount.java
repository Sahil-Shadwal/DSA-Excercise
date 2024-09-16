package Day9;

import java.util.*;

public class ZeroCount {
    public static int zeroCount(int L, int K) {
        if (K == 0) {
            return L;
        } else if (K == L) {
            return 0;
        } else if (K > 0) {
            return 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(zeroCount(L, K));
        sc.close();
    }
}
