package LinkedList;

public class sum {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sum(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            int digit1 = (list1 != null) ? list1.data : 0;
            int digit2 = (list2 != null) ? list2.data : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            list1 = (list1 != null) ? list1.next : null;
            list2 = (list2 != null) ? list2.next : null;
        }
        return dummyHead.next;
    }

    public static void main(String args[]) {
        // Node list1 = new Node(2);
        // list1.next = new Node(4);
        // list1.next.next = new Node(3);
        // list1.next.next.next = new Node(5);

        // Node list2 = new Node(5);
        // list2.next = new Node(6);
        // list2.next.next = new Node(4);

        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(9);

        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);
        list2.next.next.next = new Node(9);

        Node result = sum(list1, list2);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
