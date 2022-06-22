package akm;

public class D6Q4d_CheckIfGivenLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null&&fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
//        Node.printLinkedList(head);
        slow = slow.next;
        ListNode dummy = head;

        while(slow!=null) {
            if(dummy.val != slow.val) return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode cur) {
        ListNode pre=null;
        ListNode nex=null;
        while(cur!=null) {
            nex = cur.next;
            cur.next = pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }

    public static void main(String[] args) {
        D6Q4d_CheckIfGivenLinkedListIsPalindrome palindrome=new D6Q4d_CheckIfGivenLinkedListIsPalindrome();
        ListNode head1= NodeEdit.getHeadPalindrome1();
        NodeEdit.printLinkedList(head1);
        System.out.println(palindrome.isPalindrome(head1));
        ListNode head2= NodeEdit.getHeadPalindrome2();
        NodeEdit.printLinkedList(head2);
        System.out.println(palindrome.isPalindrome(head2));
        ListNode hhh=new ListNode();
        System.out.println(palindrome.isPalindrome(hhh));

    }
}
