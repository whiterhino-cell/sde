package akm;

public class D5Q4b_Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head=new ListNode();
        dummy_head.next=head;

//        ListNode temp=head;

        ListNode slow=dummy_head;
        ListNode fast=dummy_head;

        while(n-->0) fast=fast.next;
        while (fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }

        slow.next=slow.next.next;

//        return head;   //wrong
        return dummy_head.next;
    }
    public static void main(String[] args) {
        D5Q4b_Remove_Nth_Node_From_End_Of_List list=new D5Q4b_Remove_Nth_Node_From_End_Of_List();
        ListNode head= NodeEdit.getHead();
        NodeEdit.printLinkedList(head);
        head=list.removeNthFromEnd(head,5);
        NodeEdit.printLinkedList(head);

        System.out.println();
        head=new ListNode(1,null);
        NodeEdit.printLinkedList(head);
        head=list.removeNthFromEnd(head,1);
        NodeEdit.printLinkedList(head);

    }
}
