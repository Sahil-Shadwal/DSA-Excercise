package LinkedList;

class reversalII {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        // ListNode() {
        // }

        ListNode(int val) {
            this.val = val;
        }

        // ListNode(int val, ListNode next) {
        // this.val = val;
        // this.next = next;
        // }
    }

    // Method to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move pointers one position ahead
            current = next;
        }
        return prev; // New head of the reversed list
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
