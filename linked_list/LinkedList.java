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
    public static int size;

    // create new Node
    // new node's next = head
    // head = new Node
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void add(int idx, int data){
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public int removeLast() {
        int val = tail.data;

        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {

            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = head.next;
        }

        temp.next.next = null;
        tail = temp;
        size--;
        return val;

    }
    // public void removeFirst(){
    //     // int val = head.data;
    //     head = head.next;
    //     return;
    // }

    public int itrSearcch(int key){
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(9);
        ll.add(2,3);
        ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        System.out.println(ll.itrSearcch(4));
        System.out.println(ll.itrSearcch(40));
        System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(3));
        
        // System.out.println(ll.size);
    }
}
