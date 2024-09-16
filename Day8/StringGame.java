package Day8;

import java.util.*;

public class StringGame {
    public static String deriveString(String A, String B) {
        // Create a set of characters to remove
        HashSet<Character> toRemove = new HashSet<>();
        for (char c : B.toCharArray()) {
            toRemove.add(c);
        }
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : A.toCharArray()) {
            if (!toRemove.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings A and B
        System.out.print("Enter string A: ");
        String A = sc.nextLine();
        System.out.print("Enter string B: ");
        String B = sc.nextLine();
        String C = deriveString(A, B);
        System.out.println("Output string C: " + C);

    }
}
