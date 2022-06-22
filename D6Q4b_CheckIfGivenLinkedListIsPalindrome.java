package akm;

import java.util.HashMap;

public class D6Q4b_CheckIfGivenLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head==null)return true;
        if (head.next==null)return true;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int l=0;
        ListNode temp=head;
        while (temp!=null){
            l++;
            temp=temp.next;
        }
        int mid=(int)Math.ceil(((double)l)/2);
        temp=head;
        for (int i = 0; i < mid; i++) {
            hmap.put(i, temp.val);
            temp=temp.next;
        }
        for (int i = mid; i < l; i++) {
            if (hmap.get(l-i-1)!=temp.val)
                return false;
            temp=temp.next;
        }
        return  true;
    }

    public static void main(String[] args) {
        D6Q4b_CheckIfGivenLinkedListIsPalindrome palindrome=new D6Q4b_CheckIfGivenLinkedListIsPalindrome();
        ListNode head1= NodeEdit.getHeadPalindrome1();
        NodeEdit.printLinkedList(head1);
        System.out.println(palindrome.isPalindrome(head1));
        ListNode head2= NodeEdit.getHeadPalindrome2();
        NodeEdit.printLinkedList(head2);
        System.out.println(palindrome.isPalindrome(head2));
    }

}
