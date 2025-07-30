import java.util.List;

public class Problem2 {
    // Reverse Linked List
    // Statement: Given the head of a singly linked list, reverse the list, and
    // return the reversed list.
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        head = prev;
        return head;
    }
}
