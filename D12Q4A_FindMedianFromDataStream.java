package akm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class D12Q4A_FindMedianFromDataStream {
    private ArrayList<Integer> arrayList;

    public D12Q4A_FindMedianFromDataStream() {

        arrayList=new ArrayList<>();
    }

    public void addNum(int num) {
        arrayList.add(num);
        Collections.sort(arrayList);
    }

    public double findMedian() {
        int n=arrayList.size();
        if (n%2==0)
            return (arrayList.get(n/2-1) + arrayList.get(n/2)) / 2.0;
        else
            return arrayList.get(n/2);
    }

}
