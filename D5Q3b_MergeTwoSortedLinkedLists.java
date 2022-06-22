package akm;

public class D5Q3b_MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1==null)return list2;
        if (list2==null)return list1;

       if (list1.val> list2.val){
           ListNode tem=list1;
           list1=list2;
           list2=tem;
       }
       ListNode res=list1,temp=null;
       while (list1!=null&&list2!=null){
           while (list1!=null&&list1.val<= list2.val){
               temp=list1;
               list1=list1.next;
           }
           temp.next=list2;
           ListNode tem=list1;
           list1=list2;
           list2=tem;
       }
       return res;
    }
    public static void main(String[] args) {

        ListNode head1= NodeEdit.getHead();
        ListNode head2= NodeEdit.getHead2();

        D5Q3b_MergeTwoSortedLinkedLists linkedLists=new D5Q3b_MergeTwoSortedLinkedLists();
        NodeEdit.printLinkedList(head1);
        NodeEdit.printLinkedList(head2);

        ListNode head=linkedLists.mergeTwoLists(head1,head2);
        NodeEdit.printLinkedList(head);
    }
}
