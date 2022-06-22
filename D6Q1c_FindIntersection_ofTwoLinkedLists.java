package akm;

public class D6Q1c_FindIntersection_ofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=0,n2=0;
        ListNode temp=headA;
        while (temp!=null){
            n1++;
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null){
            n2++;
            temp=temp.next;
        }
        if (n1>n2){
            int diff=n1-n2;
            while (diff-->0){
                headA=headA.next;
            }
        }else {
            int diff=n2-n1;
            while (diff-->0){
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){ //ek se bhi kaam chal jayega
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }

        return headA;
    }

    public static void main(String[] args) {
        D6Q1c_FindIntersection_ofTwoLinkedLists lists=new D6Q1c_FindIntersection_ofTwoLinkedLists();
        ListNode head1= NodeEdit.getHead3();
        ListNode head2= NodeEdit.getHead4();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);
        ListNode node=lists.getIntersectionNode(head1,head2);
        NodeEdit.printLinkedList(node);
    }
}
