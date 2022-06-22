package akm;

public class D5Q2a_MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode dummy_head=head;
        int count =0;
        while (dummy_head!=null){
            dummy_head =dummy_head.next;
            count++;
        }

        int mid =count/2;
        while(mid-->0){
            head =head.next;
        }
        return head;
    }
    public static void main(String[] args) {

        ListNode l1= NodeEdit.getHead();

        print(l1);
        D5Q2a_MiddleOfLinkedList middleOfLinkedList=new D5Q2a_MiddleOfLinkedList();

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
