package akm;

import java.util.HashSet;

public class D6Q2b_FindIntersection_ofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet =new HashSet<>();;
        while (headA!=null){
            hashSet.add(headA);
            headA=headA.next;
        }
        while (headB!=null) {
            if (hashSet.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        D6Q2b_FindIntersection_ofTwoLinkedLists lists=new D6Q2b_FindIntersection_ofTwoLinkedLists();
        ListNode head1= NodeEdit.getHead3();
        ListNode head2= NodeEdit.getHead4();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);
        ListNode node=lists.getIntersectionNode(head1,head2);
        NodeEdit.printLinkedList(node);

    }
}
