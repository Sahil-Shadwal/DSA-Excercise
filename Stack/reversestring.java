package Stack;
import java.util.*;
public class reversestring {
    public static String stringreversal(String s){
        Stack<Character> ch = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            ch.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder("");
        while(!ch.isEmpty()){
            result.append(ch.pop());
        }
        return result.toString();
    }
    public static void main(String args[]){
        String s = "push_comes_to__shove";
        System.out.println(stringreversal(s));
    }
}
