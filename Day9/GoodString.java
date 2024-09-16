package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int[] a = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            a[i] = (int) s1.charAt(i);
        }
        Arrays.sort(a);
        int res = 0;
        int prev = (int) s1.charAt(0);
        for (int i = 0; i < s2.length(); i++) {
            int b = (int) s2.charAt(i);
            int l = 0, r = a.length - 1;
            int good = Integer.MAX_VALUE;
            int curr = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (a[mid] == b) {
                    curr = prev;
                    good = 0;
                    break;
                } else if (a[mid] < b) {
                    if (Math.abs(a[mid] - b) < good) {
                        good = Math.abs(a[mid] - b);
                        curr = a[mid];
                    } else if (Math.abs(a[mid] - b) == good) {
                        if (Math.abs(curr - prev) > Math.abs(a[mid] - prev)) {
                            curr = a[mid];
                            good = Math.abs(a[mid] - prev);
                        } else {
                            good = Math.abs(curr - prev);
                        }
                    }
                    l = mid + 1;
                } else {
                    if (Math.abs(a[mid] - b) < good) {
                        good = Math.abs(a[mid] - b);
                        curr = a[mid];
                    } else if (Math.abs(a[mid] - b) == good) {
                        if (Math.abs(curr - prev) > Math.abs(a[mid] - prev)) {
                            curr = a[mid];
                            good = Math.abs(a[mid] - prev);
                        } else {
                            good = Math.abs(curr - prev);
                        }
                    }
                    r = mid - 1;
                }
            }
            prev = curr;
            res += good;
        }
        System.out.println(res);
        scanner.close();
    }
}