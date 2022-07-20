package akm;

import java.util.Stack;

public class D13Q4a_ImplementQueueUsingStack {
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
        Stack< Integer > s1 = new Stack < > ();
        Stack< Integer > s2 = new Stack < > ();

        public void push(int x) {
            while (s1.empty() == false) {
                s2.push(s1.peek());
                s1.pop();
            }

            System.out.println("The element pushed is " + x);
            s1.push(x);

            while (s2.empty() == false) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        public int pop() {
            // shift input to output
            if (s1.empty()) {
                System.out.println("Stack is empty");
            }
            int val = s1.peek();
            s1.pop();
            return val;
        }

        public int peek() {
            // shift input to output
            if (s1.empty()) {
                System.out.println("Stack is empty");
            }
            return s1.peek();
        }

        public int size() {
            return s1.size();

        }
    }
}
