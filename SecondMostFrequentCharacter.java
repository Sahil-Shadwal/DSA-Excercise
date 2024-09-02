
// Java Program to find the second most frequent character in a given string
import java.util.*;

public class SecondMostFrequentCharacter {

    static final int CHARS = 256;

    static char secondMostFreqChar(String str1) {
        int[] ch = new int[CHARS];
        for (int i = 0; i < str1.length(); i++)
            (ch[str1.charAt(i)])++;
        int ch_first = 0, ch_second = 0;
        for (int i = 0; i < CHARS; i++) {
            if (ch[i] > ch[ch_first]) {
                ch_second = ch_first;
                ch_first = i;
            } else if (ch[i] > ch[ch_second] && ch[i] != ch[ch_first])
                ch_second = i;
        }
        return (char) ch_second;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.next();
        System.out.println("The given string is: " + str1);
        char res = secondMostFreqChar(str1);
        if (res != '\0')
            System.out.println("The second most frequent character in the string is: " + res);
        else
            System.out.println("No second most frequent character found in the string");
        sc.close();
    }
}