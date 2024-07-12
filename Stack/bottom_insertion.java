package Stack;
import java.util.*;

public class bottom_insertion {
    public static void bottomShover(Stack<Integer> s, int a){
        if(s.isEmpty()){
            s.push(a);
            return;
        }
        int top = s.pop();
        bottomShover(s, a);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int a = 0;
        bottomShover(s, a);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
