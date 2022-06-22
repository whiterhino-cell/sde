package akm;

import java.util.ArrayList;

public class D6Q4c_CheckIfGivenLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        int n=arrayList.size();
        for(int i=0;i<n/2;i++) {
            if (arrayList.get(i) != arrayList.get(n - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        D6Q4c_CheckIfGivenLinkedListIsPalindrome palindrome=new D6Q4c_CheckIfGivenLinkedListIsPalindrome();
        ListNode head1= NodeEdit.getHeadPalindrome1();
        NodeEdit.printLinkedList(head1);
        System.out.println(palindrome.isPalindrome(head1));
        ListNode head2= NodeEdit.getHeadPalindrome2();
        NodeEdit.printLinkedList(head2);
        System.out.println(palindrome.isPalindrome(head2));
    }
}
