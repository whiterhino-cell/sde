package akm;

import java.util.HashSet;

public class D6Q5a_LinkedListCycle_II {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> st=new HashSet<>();
        while(head != null) {
            if(st.contains(head)) return head;
            st.add(head);
            head = head.next;
        }
        return null;
    }


}
