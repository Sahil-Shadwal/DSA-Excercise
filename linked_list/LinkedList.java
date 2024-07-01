package linked_list;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        //*constructor 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //* Since there can be only one head and tail 
    //* so we are defining them as a property in the class */
    public static Node head;
    public static Node tail;

    // create new Node
    // new node's next = head
    // head = new Node
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
    }
}
