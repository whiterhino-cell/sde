package akm;

public class D6Q3a_ReverseNodesIn_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null||k==1)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur = dummy,nex=dummy,pre=dummy;

        int count=0;
        while (cur.next!=null){
            cur=cur.next;
            count++;
        }
        while (count>=k){
            cur=pre.next;
            nex=cur.next;
            for (int j = 1; j < k; j++) {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            count-=k;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        D6Q3a_ReverseNodesIn_k_Group group=new D6Q3a_ReverseNodesIn_k_Group();
        ListNode node= NodeEdit.getHead();
        NodeEdit.printLinkedList(node);
        ListNode ans=group.reverseKGroup(node,3);
        NodeEdit.printLinkedList(ans);

    }
}
// kar le tu he