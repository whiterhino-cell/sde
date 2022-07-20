package akm;

import java.util.Stack;

public class D13Q4b_ImplementQueueUsingStack {
    public static void main(String args[]) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

    }
    static class MyQueue {
        Stack < Integer > input = new Stack < > ();
        Stack < Integer > output = new Stack < > ();

        public void push(int x) {
            System.out.println("The element pushed is " + x);
            input.push(x);
        }

        public int pop() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }


            int x = output.peek();
            output.pop();
            return x;
        }

        public int peek() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }
            return output.peek();
        }
        int size() {
            return (output.size() + input.size());

        }


    }
}
