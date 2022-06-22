package akm;

import java.util.HashMap;

public class D7Q2a_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        // HashMap which holds old nodes as keys and new nodes as its values.
        HashMap<Node, Node> map = new HashMap<>();

        //copy list nodes into hash table
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        //deep copy using hash table
        temp = head;
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        //return new head
        return map.get(head);
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







