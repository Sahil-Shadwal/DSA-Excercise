package LinkedList;

public class middleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printList() {
        Node current = head;
        if (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static Node middle(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        // Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);

        // System.out.println("Original List:");
        // printList();

        Node result = middle(head);
        System.out.println(result.data);
    }
}
