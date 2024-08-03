package LinkedList;

public class cycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean findCycle(Node list) {
        if (list == null) {
            return false;
        }
        Node slow = list;
        Node fast = list.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node detectCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

    public static void main(String args[]) {
        Node list = new Node(5);
        list.next = new Node(6);
        list.next.next = new Node(4);
        list.next.next.next = new Node(9);
        list.next.next.next.next = new Node(1);

        // list.next.next.next.next.next = list.next.next;

        System.out.println(findCycle(list));
        System.out.println(detectCycle(list));

    }
}
