package Queue;
import java.util.*;
public class reversal {
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for(int i = 0; i< n; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        queueReversal(q);
    }

    
}
