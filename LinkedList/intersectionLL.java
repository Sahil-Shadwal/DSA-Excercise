package LinkedList;

public class intersectionLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersection(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        Node headA = list1;
        Node headB = list2;

        while (headA != headB) {
            headA = (headA == null) ? list1 : headA.next;
            headB = (headB == null) ? list2 : headB.next;
        }
        return headA;
    }

    public static void main(String args[]) {
        Node list1 = new Node(1);
        list1.next = new Node(9);
        list1.next.next = new Node(1);
        list1.next.next.next = new Node(2);
        list1.next.next.next.next = new Node(4);

        Node list2 = new Node(3);
        list2.next = list1.next.next.next; // Intersection at node with value 2 in listA

        Node result = intersection(list1, list2);
        if (result != null) {
            System.out.println("Intersection node data: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
