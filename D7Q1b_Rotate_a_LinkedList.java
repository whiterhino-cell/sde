package akm;

public class D7Q1b_Rotate_a_LinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null||k == 0) return head;
        //calculating length
        ListNode temp = head;
        int length = 1;
        while(temp.next != null) {
            ++length;
            temp = temp.next;
        }
        //link last node to first node
        temp.next = head;
        k = k%length;
        int end = length-k;
        while(end-->0) temp = temp.next;
        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        D7Q1b_Rotate_a_LinkedList list=new D7Q1b_Rotate_a_LinkedList();
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
