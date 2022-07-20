package akm;

import java.util.Stack;

public class D14Q08b_StockSpanner {
    Stack<int[]> stack;

    public D14Q08b_StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int count = 0;
        while(!stack.isEmpty() && stack.peek()[0]<= price){
            count+=stack.pop()[1];
        }
        count++;
        stack.push(new int[]{price, count});
        return count;
    }
}
