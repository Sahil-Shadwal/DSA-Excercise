package LinkedList;

public class mergeLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node merge(Node list1, Node list2) {
        Node result = new Node(0);
        Node cur = result;

        while (list1 != null && list2 != null) {
            if (list1.data > list2.data) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        // if (list1 != null) {
        // cur.next = list1;
        // } else {
        // cur.next = list2;
        // }
        // or
        cur.next = (list1 != null) ? list1 : list2;
        return result.next;
    }

    public static void main(String args[]) {
        // int list1[] = {1, 3, 5, 9};
        // int list2[] = {2, 4, 7};
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(9);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(7);

        Node mergedList = merge(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.data + " ");
            mergedList = mergedList.next;
        }
    }
}
