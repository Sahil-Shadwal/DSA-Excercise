import java.util.Scanner;

public class CommonSubsequence {

    // Function to count the number of subsequences in the string
    public static int countSequences(String str, String str1) {
        int l1 = str.length();
        int l2 = str1.length();
        int[][] cnt = new int[l1 + 1][l2 + 1];

        // Initialize the cnt array
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                cnt[i][j] = 0;
            }
        }

        // Taking each character from the first string
        for (int i = 1; i <= l1; i++) {
            // Taking each character from the second string
            for (int j = 1; j <= l2; j++) {
                // If characters are the same in both strings
                if (str.charAt(i - 1) == str1.charAt(j - 1)) {
                    cnt[i][j] = 1 + cnt[i][j - 1] + cnt[i - 1][j];
                } else {
                    cnt[i][j] = cnt[i][j - 1] + cnt[i - 1][j] - cnt[i - 1][j - 1];
                }
            }
        }
        return cnt[l1][l2];
    }

    // Main function for printing the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str1 = scanner.nextLine();
        System.out.println("Number of common subsequences is: " + countSequences(str, str1));
        scanner.close();
    }
}

/*
 * Program to count common subsequence in two strings
 * Today we will learn program to count common subsequence in two strings. We
 * will take two strings as an input, then we will use a 2-D ”cnt[][]” array
 * that will store the count of common subsequence found.
 * Now we will iterate each character of the first string and each character of
 * the second string from the start of the string to its end.
 * If the characters match, we will check if the previous character of both
 * strings are the same or not. If they are the same, we will assign ”1 +
 * cnt[i][j – 1] + cnt[i – 1][j]” to our 2D array.
 * Else we will assign ”cnt[i][j – 1] + cnt[i – 1][j] – cnt[i – 1][j – 1]” to
 * our 2D array.
 * As the iteration ends, we will get our count.
 */