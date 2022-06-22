package akm;

public class D7Q1a_Rotate_a_LinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dummy=head;int c=0;
        while (dummy!=null) {
            c++;
            dummy=dummy.next;
        }
//        System.out.println(k+" "+c+" = "+(k%c));
        k=k%c;
//        System.out.println(k);
        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            while (temp.next.next != null) temp = temp.next;
            ListNode end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }

    public static void main(String[] args) {
        D7Q1a_Rotate_a_LinkedList list=new D7Q1a_Rotate_a_LinkedList();
        int arr[]={1,2,3,4,5};
        ListNode head= NodeEdit.createHead(arr);
        NodeEdit.printLinkedList(head);
        head=list.rotateRight(head,69);
        NodeEdit.printLinkedList(head);

        int arr2[]={4,5,1,2,3};
        ListNode head2= NodeEdit.createHead(arr2);
        NodeEdit.printLinkedList(head2);
        head2=list.rotateRight(head2,2);
        NodeEdit.printLinkedList(head2);
    }
}
