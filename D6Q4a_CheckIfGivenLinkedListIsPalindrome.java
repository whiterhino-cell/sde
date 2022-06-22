package akm;

public class D6Q4a_CheckIfGivenLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode dummyTemp=null,dummyHead=head;
        ListNode temp=new ListNode();

        while (dummyHead!=null){
            temp=new ListNode(dummyHead.val,dummyTemp);
            dummyTemp=temp;
            dummyHead=dummyHead.next;
        }

//        Node.printLinkedList(temp);
//        Node.printLinkedList(head);

        while (head!=null){
            if (head.val!= temp.val)
                return false;
            temp=temp.next;
            head= head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        D6Q4a_CheckIfGivenLinkedListIsPalindrome palindrome=new D6Q4a_CheckIfGivenLinkedListIsPalindrome();
        ListNode head1= NodeEdit.getHeadPalindrome1();
        NodeEdit.printLinkedList(head1);
        System.out.println(palindrome.isPalindrome(head1));
        ListNode head2= NodeEdit.getHeadPalindrome2();
        NodeEdit.printLinkedList(head2);
        System.out.println(palindrome.isPalindrome(head2));
    }

}
