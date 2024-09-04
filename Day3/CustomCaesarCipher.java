package Day3;

import java.util.*;

public class CustomCaesarCipher {

    public static String caesar(String text, int key) {
        if (key < 0) {
            return "Invalid Input";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);

            if (Character.isUpperCase(charAt)) {
                result.append((char) ((charAt + key - 'A') % 26 + 'A'));

            } else if (Character.isLowerCase(charAt)) {
                result.append((char) ((charAt + key - 'a') % 26 + 'a'));
            } else if (Character.isDigit(charAt)) {
                result.append((char) ((charAt + key - '0') % 26 + '0'));
            } else if (charAt == '-') {
                result.append('-');
            } else if (charAt == ' ') {
                result.append(' ');
            }

        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your plain text: ");
        String text = sc.nextLine();

        System.out.println("Enter the key");
        int key = sc.nextInt();

        String encryptedText = caesar(text, key);
        System.out.println("The encrypted text is : " + encryptedText);
        sc.close();
    }

}
