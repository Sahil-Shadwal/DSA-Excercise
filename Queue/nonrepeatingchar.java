package Queue;
import java.util.*;
public class nonrepeatingchar {
    public static void nonReapeat(String str){
        int arr[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            arr[ch - 'a']++;

            while(!q.isEmpty() && arr[q.peek()-'a']> 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1+ " ");
            } else{
                System.out.println(q.peek() + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        String str = "aabcabcax";
        nonReapeat(str);
    }
}
