public class Problem2 {

    //Q) Remove Linked List Elements
    //Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode currHead = new ListNode(0);
        currHead.next = head;
        ListNode current = currHead;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return currHead.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode n7 = new ListNode(6);
        ListNode n6 = new ListNode(5, n7);
        ListNode n5 = new ListNode(4, n6);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(6, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode result = removeElements(n1, 6);
        printList(result);
    }
}
