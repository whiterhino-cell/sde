package akm;

import java.util.HashMap;
import java.util.Map;

public class D14Q02_ImplementLRUCache {
    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map< Integer, Node > map = new HashMap();
    int capacity;

    public D14Q02_ImplementLRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;

//        Node p=node.prev;
//        Node n=node.next;
//        p.next=n;
//        n.prev=p;

    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;
    }

    class Node {
        Node prev, next;
        int key, value;
        Node(){}
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        D14Q02_ImplementLRUCache lruCache=new D14Q02_ImplementLRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);

    }
}


