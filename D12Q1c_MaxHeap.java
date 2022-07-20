package akm;

import java.util.Collections;
import java.util.PriorityQueue;

public class D12Q1c_MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        System.out.println(p.peek());

        p.forEach((x)->System.out.print(x+" "));
        p.poll();
        System.out.println("\nAfter deletion");
        p.forEach((x)->System.out.print(x+" "));
    }
}

//30
//30 15 20 5 10 3
//After deletion
//20 15 3 5 10
//Process finished with exit code 0