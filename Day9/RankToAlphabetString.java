package Day9;

import java.util.*;

public class RankToAlphabetString {
    public static String generateStringFromRank(int rank, int length) {
        StringBuilder result = new StringBuilder();
        char[] alphabets = new char[26];
        for (int i = 0; i < 26; ++i) {
            alphabets[i] = (char) ('a' + i);
        }
        rank -= 1;
        for (int i = 0; i < length; ++i) {
            int index = rank % 26;
            result.insert(0, alphabets[index]);
            rank /= 26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rank = sc.nextInt();
        int length = sc.nextInt();

        String resultString = generateStringFromRank(rank, length);
        System.out.println(resultString);
        sc.close();
    }
}
