import java.util.Scanner;

public class InfiltrationGame {

    // Method to count the number of vowels in a given string
    public static int countVowels(String s) {
        int vowelCount = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    // Method to determine the winner based on the game rules
    public static String determineWinner(String s) {
        boolean alexTurn = true;
        while (true) {
            boolean moveMade = false;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String substring = s.substring(i, j);
                    int vowelCount = countVowels(substring);
                    if ((alexTurn && vowelCount % 2 == 1) || (!alexTurn && vowelCount % 2 == 0)) {
                        s = s.substring(0, i) + s.substring(j);
                        moveMade = true;
                        break;
                    }
                }
                if (moveMade)
                    break;
            }
            if (!moveMade) {
                return alexTurn ? "Chris" : "Alex";
            }
            alexTurn = !alexTurn;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean validInput = false;

        // Input number of strings with validation
        while (!validInput) {
            System.out.println("Enter number of strings:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.nextLine(); // Consume the newline character

        // Process each string
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            String code = scanner.nextLine();
            System.out.println(determineWinner(code));
        }

        scanner.close();
    }
}