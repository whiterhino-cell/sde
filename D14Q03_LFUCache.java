package akm;

import java.util.HashMap;
import java.util.Map;

public class D14Q03_LFUCache {

    final int capacity;
    int curSize;
    int minFrequency;
    Map<Integer, DLLNode> cache;
    Map<Integer, DoubleLinkedList> frequencyMap;


    public D14Q03_LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFrequency = 0;

        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        System.out.println(" get : "+key);
        DLLNode curNode = cache.get(key);
        if (curNode == null) {
            return -1;
        }
        updateNode(curNode);
        return curNode.val;
    }

    public void put(int key, int value) {
        // corner case: check cache capacity initialization
        System.out.println(key+" : "+value);
        System.out.println("put 1 :");
        printF();
        if (capacity == 0) {
            return;
        }

        if (cache.containsKey(key)) {
            DLLNode curNode = cache.get(key);
            curNode.val = value;
            updateNode(curNode);
        } else {
            curSize++;
            if (curSize > capacity) {
                System.out.println("put 2 :"+curSize+" if");

                DoubleLinkedList minFreqList =
                        frequencyMap.get(minFrequency);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                curSize--;
                System.out.println("put 3 :"+curSize+" if");
                printF();
            }
//            System.out.println(key+" : "+value+" : "+curSize+" out");
            minFrequency = 1;
            DLLNode newNode = new DLLNode(key, value);

            DoubleLinkedList curList =
                    frequencyMap.getOrDefault(1, new DoubleLinkedList());
            curList.addNode(newNode);
            frequencyMap.put(1, curList);
            cache.put(key, newNode);
            System.out.println("put 4 :");
            printF();
            System.out.println();
        }
    }

    public void updateNode(DLLNode curNode) {
        int curFreq = curNode.frequency;
        DoubleLinkedList curList = frequencyMap.get(curFreq);
        curList.removeNode(curNode);

        if (curFreq == minFrequency && curList.listSize == 0) {
            minFrequency++;
        }

        curNode.frequency++;
        DoubleLinkedList newList = frequencyMap.
                getOrDefault(curNode.frequency, new DoubleLinkedList());
        newList.addNode(curNode);
        frequencyMap.put(curNode.frequency, newList);
        System.out.println("updateNode :("+curNode.key+")");
        printF();
        System.out.println();
    }

    class DLLNode {
        int key;
        int val;
        int frequency;
        DLLNode prev;
        DLLNode next;

        public DLLNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.frequency = 1;
        }
    }

    class DoubleLinkedList {
        int listSize;
        DLLNode head;
        DLLNode tail;
        public DoubleLinkedList() {
            this.listSize = 0;
            this.head = new DLLNode(0, 0);
            this.tail = new DLLNode(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        /** add new node into head of list and increase list size by 1 **/
        public void addNode(DLLNode curNode) {
            DLLNode nextNode = head.next;
            curNode.next = nextNode;
            curNode.prev = head;
            head.next = curNode;
            nextNode.prev = curNode;
            listSize++;
//            curNode.next =  head.next;
//            curNode.prev = head;
//            head.next = curNode;
//            curNode.next.prev = curNode;
//            listSize++;
        }

        /** remove input node and decrease list size by 1**/
        public void removeNode(DLLNode curNode) {
            DLLNode prevNode = curNode.prev;
            DLLNode nextNode = curNode.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;
        }

    }

    public static void main(String[] args) {
        D14Q03_LFUCache lfu=new D14Q03_LFUCache(2);
//        lfu.put(1, 1);
//        lfu.put(2, 2);
//        lfu.get(1);
//        lfu.put(3, 3);
//        lfu.get(2);
//        lfu.get(3);
//        lfu.put(4, 4);
//        lfu.get(1);
//        lfu.get(3);
//        lfu.get(4);

        lfu=new D14Q03_LFUCache(3);
        lfu.put(1, 10);
        lfu.put(3,15);
        lfu.put(2,12);
        lfu.get(3);
        lfu.put(4,20);
        lfu.get(2);
        lfu.put(4, 25);
        lfu.get(6);


    }

    private void printF() {
        for (int key :frequencyMap.keySet()) {
            DoubleLinkedList ll=frequencyMap.get(key);
            DLLNode node=ll.head.next;
            System.out.print("key = "+key+" ::: ");
            while (ll.tail!=node){
                System.out.print("("+node.key+": "+node.val+") , ");
                node=node.next;
            }
            System.out.println(" ");

        }
    }

}

