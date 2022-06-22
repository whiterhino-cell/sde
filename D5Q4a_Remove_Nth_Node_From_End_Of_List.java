package akm;

public class D5Q4a_Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head=head;
        ListNode temp=head;
        int count =0;
        while (dummy_head!=null){
            dummy_head =dummy_head.next;
            count++;
        }

        int del=count-n;
        if (del == 0) return head.next;
        for (int i = 1; i <del ; i++) temp=temp.next;
        temp.next=temp.next.next;
        return head;
    }
    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode ans=new ListNode();
        ans.next=head;
        ListNode dummy_head=head,temp=ans;
//        counting
        int count =0;
        while (dummy_head!=null){
            dummy_head =dummy_head.next;
            count++;
        }

        int del=count-n;
        System.out.println("count : "+count);
        System.out.println("del   : "+del);
        if (del == 0) return head;
        for (int i = 1; i <=del ; i++) temp=temp.next;
        NodeEdit.printLinkedList(ans);

        temp.next=temp.next.next;
        NodeEdit.printLinkedList(ans);
        return ans;
    }

    public static void main(String[] args) {
        D5Q4a_Remove_Nth_Node_From_End_Of_List list=new D5Q4a_Remove_Nth_Node_From_End_Of_List();
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