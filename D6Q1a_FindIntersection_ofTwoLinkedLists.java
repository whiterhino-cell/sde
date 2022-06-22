package akm;

public class D6Q1a_FindIntersection_ofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA!=null){
            ListNode temp_headB=headB;
            while (temp_headB!=null){
                if (headA==temp_headB)
                    return headA;
                temp_headB=temp_headB.next;
            }
            headA= headA.next;
        }

        return null;
    }

    public static void main(String[] args) {
        D6Q1a_FindIntersection_ofTwoLinkedLists lists=new D6Q1a_FindIntersection_ofTwoLinkedLists();
        ListNode head1= NodeEdit.getHead3();
        ListNode head2= NodeEdit.getHead4();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);
        ListNode node=lists.getIntersectionNode(head1,head2);
        NodeEdit.printLinkedList(node);

    }
}
