// Determine if 2 strings are anagram of each other
package String;
import java.util.*;


public class anagram {
    public static boolean isanagram(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }
    public static void main(String args[]){
        String s1 = "ass";
        String s2 = "ssa";
    
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isanagram(s1, s2));
    }
}
