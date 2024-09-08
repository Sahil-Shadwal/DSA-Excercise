package IBM;

import java.util.*;

public class properCompression {
    public static String compression(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + count);
        }

        StringBuilder compressStr = new StringBuilder();
        for (char c : new TreeSet<>(charCountMap.keySet())) {
            compressStr.append(c).append(charCountMap.get(c));
        }
        return compressStr.toString();
    }

    public static void main(String[] args) {
        String inputStr = "a3b5c2a2";
        String compressedResult = compression(inputStr);
        System.out.println(compressedResult);
    }
}
