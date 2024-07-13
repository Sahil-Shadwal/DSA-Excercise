package Stack;
import java.util.*;


public class reverse_stack {
    public static void bottomPush(Stack<Integer> st, int a){
        if(st.isEmpty()){
            st.push(a);
            return;
        }
        int top = st.pop();
        bottomPush(st, a) ;
        st.push(top);


    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        bottomPush(st, top);

    }
    public static void printStack(Stack<Integer> st){
        while(!st.isEmpty()){
            
            System.out.println(st.pop());
        }
    }
    public static  void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        System.out.println("Oh so fine teddies");
        reverseStack(s);
        printStack(s);
    }
}
