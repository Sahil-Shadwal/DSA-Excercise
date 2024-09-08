package IBM;

import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");

        int decimalNumber = scanner.nextInt();
        String binarystring = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary Representation : " + binarystring);

        scanner.close();

    }
}
