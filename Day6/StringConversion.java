package Day6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // if (a.equals(b)) {
        // System.out.println(1);
        // return;
        // }

        StringBuilder res = new StringBuilder();
        StringBuilder res2 = new StringBuilder();

        for (int x = 0; x < n; x++) {
            if (a.charAt(x) != b.charAt(x)) {
                res.append(a.charAt(x));
                res2.append(b.charAt(x));
            }
        }

        int ans = 0;
        for (char i : a.toCharArray()) {
            if (ans != 0) {
                break;
            }
            if (b.indexOf(i) == -1) {
                System.out.println(-1);
                break;
            } else {
                Set<Character> setRes2 = new HashSet<>();
                for (char ch : res2.toString().toCharArray()) {
                    setRes2.add(ch);
                }
                for (char x : setRes2) {
                    if (a.indexOf(x) == -1) {
                        System.out.println(-1);
                        ans += 1;
                        break;
                    } else {
                        System.out.println(setRes2.size());
                        ans += 1;
                        break;
                    }
                }
            }
            if (ans == 1) {
                break;
            }
        }
    }
}