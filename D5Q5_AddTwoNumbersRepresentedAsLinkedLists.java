package akm;

public class D5Q5_AddTwoNumbersRepresentedAsLinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head=new ListNode();
        ListNode temp=dummy_head;
        int c=0;
        while (l1!=null||l2!=null||c!=0){
            int sum=0;
            if (l1!=null) {
                sum += l1.val;
                l1=l1.next;
            }
            if (l2!=null) {
                sum += l2.val;
                l2=l2.next;
            }
            sum+=c;
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }

        return dummy_head.next;
    }

    public static void main(String[] args) {
        D5Q5_AddTwoNumbersRepresentedAsLinkedLists lists=new D5Q5_AddTwoNumbersRepresentedAsLinkedLists();
        ListNode head1= NodeEdit.getHead();
        ListNode head2= NodeEdit.getHead2();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);
        ListNode head=lists.addTwoNumbers(head1,head2);
        NodeEdit.printLinkedList(head);
    }
}
