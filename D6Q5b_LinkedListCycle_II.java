package akm;

import java.util.HashSet;

public class D6Q5b_LinkedListCycle_II {
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;

        while(fast.next != null&&fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                while(slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }

}
