package akm;

import java.util.HashMap;

public class D7Q2b_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Node nex = head;

        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        while (cur != null) {
            nex = cur.next;

            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = nex;

            cur = nex;
        }

        // Second round: assign random pointers for the copy nodes.
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        // Third round: restore the original list, and extract the copy list.
        cur = head;
        Node tempHead = new Node(0);
        Node copy = tempHead;

        while (cur != null) {
            nex = cur.next.next;

            // extract the copy
            copy.next = cur.next;
            copy = copy.next;

            // restore the original list
            cur.next = nex;

            cur = nex;
        }

        return tempHead.next;
    }


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}







