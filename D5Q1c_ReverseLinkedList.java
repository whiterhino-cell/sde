package akm;

public class D5Q1c_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    //    1->2->3->4->5->null
//    5->4->3->2->1->null
    public static void main(String[] args) {
        ListNode l5=new ListNode();
        l5.val=5;
        l5.next=null;

        ListNode l4=new ListNode();
        l4.val=4;
        l4.next=l5;

        ListNode l3=new ListNode();
        l3.val=3;
        l3.next=l4;

        ListNode l2=new ListNode();
        l2.val=2;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;

        print(l1);
        D5Q1c_ReverseLinkedList reverseLinkedList=new D5Q1c_ReverseLinkedList();


        ListNode reverse= reverseLinkedList.reverseList(l1);
        print(reverse);




    }

    private static void print(ListNode head) {
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println(head);
    }

}
//  TC:O(N)
//  SC:O(1) / O(C)
