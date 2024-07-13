package HAshMap;
import java.util.*;
public class firstUniqueChar {
    public static int uniqChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0 ; i < str.length(); i++){
            char c = str.charAt(i);
            map.put( c, map.getOrDefault(c,0)+1 );

        }
        for( int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.get(c) == 1){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        String str = "leetcode";
        System.out.println(uniqChar(str));
    }
}
