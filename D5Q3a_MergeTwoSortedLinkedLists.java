package akm;

public class D5Q3a_MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode tmp_head=head;
        while (list1!=null&&list2!=null) {
            if (list1.val < list2.val) {
                ListNode temp = new ListNode(list1.val, null);
                list1=list1.next;
                tmp_head.next = temp;
                tmp_head = tmp_head.next;
            }else {
                ListNode temp = new ListNode(list2.val, null);
                list2=list2.next;
                tmp_head.next = temp;
                tmp_head = tmp_head.next;
            }
        }
        while (list1!=null) {
            ListNode temp = new ListNode(list1.val, null);
            list1=list1.next;
            tmp_head.next = temp;
            tmp_head = tmp_head.next;
        }
        while (list2!=null) {
            ListNode temp = new ListNode(list2.val, null);
            list2=list2.next;
            tmp_head.next = temp;
            tmp_head = tmp_head.next;
        }

        return head.next;
    }
    public static void main(String[] args) {
        ListNode head1= NodeEdit.getHead();
        ListNode head2= NodeEdit.getHead2();

        D5Q3a_MergeTwoSortedLinkedLists linkedLists=new D5Q3a_MergeTwoSortedLinkedLists();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);

        ListNode head=linkedLists.mergeTwoLists(head1,head2);
        NodeEdit.printLinkedList(head);
    }
}
