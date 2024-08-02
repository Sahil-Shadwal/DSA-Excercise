package LinkedList;

public class palindromeLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean palindrome(Node list) {
        if (list == null) {
            return false;
        }

        Node slow = list;
        Node fast = list.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);

        Node p1 = list;
        Node p2 = secondHalf;

        while (p2 != null) {
            if (p1.data != p2.data) {
                slow.next = reverse(secondHalf);
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        slow.next = reverse(secondHalf);
        return true;
    }

    public static Node reverse(Node list) {
        Node prev = null;
        Node curr = list;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static void main(String args[]) {
        Node list = new Node(5);
        list.next = new Node(6);
        list.next.next = new Node(4);
        list.next.next.next = new Node(6);
        list.next.next.next.next = new Node(5);

        // list.next.next.next.next.next = list.next.next;

        System.out.println(palindrome(list));
    }
}
