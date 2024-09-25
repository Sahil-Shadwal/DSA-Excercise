package Day15;

import java.util.*;

public class palindromicrange {
    public static List<Integer> pali(int start, int end) {
        List<Integer> l = new ArrayList<>();
        for (int i = start; i < end; i++) {
            int rev = 0;
            int dup = i;

            while (dup > 0) {
                int temp = dup % 10;
                rev = rev * 10 + temp;
                dup = dup / 10;
            }
            if (rev == i) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(pali(s, e));
    }
}