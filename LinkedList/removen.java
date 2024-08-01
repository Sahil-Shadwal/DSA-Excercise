package LinkedList;

public class removen {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node removenthlast(Node head, int n) {
        Node res = new Node(0, head);
        Node dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return res.next;
    }

    public static void main(String args[]) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);
        list.next.next.next.next = new Node(5);

        Node result = removenthlast(list, 2);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

}
