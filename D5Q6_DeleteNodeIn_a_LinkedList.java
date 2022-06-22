package akm;

public class D5Q6_DeleteNodeIn_a_LinkedList {
    public void deleteNode(ListNode node) {
        NodeEdit.printLinkedList(node);
        while (node.next.next!=null){
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }
    public static void main(String[] args) {
        D5Q6_DeleteNodeIn_a_LinkedList list=new D5Q6_DeleteNodeIn_a_LinkedList();
        ListNode head= NodeEdit.getHead();
        NodeEdit.printLinkedList(head);
        ListNode node=head.next.next;
        list.deleteNode(node);
        NodeEdit.printLinkedList(head);
    }
}
