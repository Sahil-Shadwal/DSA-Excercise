import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RankToAlphabetString_II {
    // Helper function to calculate factorial
    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Function to generate string from the given rank and length
    public static String generateStringFromRank(int rank, int length) {
        // List of available characters 'a' to 'z'
        List<Character> alphabets = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabets.add(c);
        }

        StringBuilder result = new StringBuilder();
        rank -= 1; // Make rank zero-based

        // Generate the string character by character
        for (int i = length; i > 0; i--) {
            // Calculate factorial for (i-1), which gives the number of permutations for the
            // remaining positions
            int fact = factorial(i - 1);
            // Determine which character to pick based on rank
            int index = rank / fact;

            if (index >= alphabets.size()) {
                throw new IllegalArgumentException("Rank exceeds the total number of possible permutations.");
            }

            // Append the character to the result
            result.append(alphabets.get(index));
            // Remove the used character from the list to avoid repetition
            alphabets.remove(index);
            // Update the rank for the next iteration
            rank %= fact;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        int rank = scanner.nextInt();
        int length = scanner.nextInt();
        // Output
        try {
            String resultString = generateStringFromRank(rank, length);
            System.out.println(resultString);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
