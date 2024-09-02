import java.util.*;

class PangramChecker_II {

    // Returns true if the string is pangram else false
    public static boolean checkPangram(String str) {
        // Convert the string to lowercase
        str = str.toLowerCase();

        // Create a hash table to mark the characters present in the string
        boolean[] mark = new boolean[26];

        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                mark[index] = true;
            }
        }

        // Return false if any character is unmarked
        for (boolean b : mark) {
            if (!b) {
                return false;
            }
        }

        // If all characters were present
        return true;
    }

    // Main Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        if (checkPangram(str))
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
        sc.close();
    }
}