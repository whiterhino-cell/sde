package akm;

import java.util.Collections;
import java.util.PriorityQueue;

public class D12Q4b_FindMedianFromDataStream {
    private PriorityQueue<Integer> leftMaxPQ;
    private PriorityQueue<Integer> rightMinPQ;
    private boolean even ;

    public D12Q4b_FindMedianFromDataStream() {
        leftMaxPQ = new PriorityQueue<>(Collections.reverseOrder());
        rightMinPQ = new PriorityQueue<>();
        even=true;
    }
    public void addNum(int num) {
        if (even) {
            rightMinPQ.offer(num);
            leftMaxPQ.offer(rightMinPQ.poll());
        } else {
            leftMaxPQ.offer(num);
            rightMinPQ.offer(leftMaxPQ.poll());
        }
        even = !even;
    }
    public double findMedian() {
        if (even)
            return (leftMaxPQ.peek() + rightMinPQ.peek()) / 2.0;
        else
            return leftMaxPQ.peek();
    }
}
