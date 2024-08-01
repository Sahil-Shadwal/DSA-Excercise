package LinkedList;

public class deleteNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void delete(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String args[]) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);
        list.next.next.next.next = new Node(5);

        delete(list.next);
        Node result = list;
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
