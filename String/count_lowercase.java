//* Count how many times lowercase vowels occured in a String entered by the user
import java.util.Scanner;

public class count_lowercase {
    // Count how many times lowercase vowels occurred in a String entered by the user
    public static int countLowercase(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        System.out.println("Number of lowercase vowels: " + countLowercase(name));
        sc.close();
    }
}