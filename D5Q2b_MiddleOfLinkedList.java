package akm;

public class D5Q2b_MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;

//        while (fast!=null && fast.next!=null){
//            fast =fast.next.next;
//            slow= slow.next;
//        }

        while (!(fast==null || fast.next==null)){
            fast =fast.next.next;
            slow= slow.next;
        }
//       D'morgens law
//        + -->or gate . -->and gate
//        !(A+B)=A!.B!
        return slow;
    }
    public static void main(String[] args) {
        ListNode l6=new ListNode();
        l6.val=6;
        l6.next=null;


        ListNode l5=new ListNode();
        l5.val=5;
        l5.next=l6;

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
        D5Q2b_MiddleOfLinkedList middleOfLinkedList=new D5Q2b_MiddleOfLinkedList();


        ListNode reverse= middleOfLinkedList.middleNode(l1);
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

//  TC : O(N) +O(N/2)
//  SC : O(1)
