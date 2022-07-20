package akm;

import java.util.LinkedList;
import java.util.Queue;

public class D13Q3a_ImplementStackUsingSingleQueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);

        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());

        while (s.size()!=0){
            System.out.print(s.pop()+" ");
        }
    }

    static class stack{
        Queue< Integer > q1 = new LinkedList< >();
        Queue< Integer > q2 = new LinkedList< >();
        void push(int x) {
            q2.add(x);
            while ( q1.size()!=0) {
                q2.add(q1.remove());
            }
            Queue< Integer > temp=q1;
            q1=q2;
            q2=temp;
        }
        int pop() {
            return q1.remove();
        }
        int top() {
            return q1.peek();
        }
        int size() {
            return q1.size();
        }
    }
}
//Top of the stack: 1
//Size of the stack before removing element: 4
//The deleted element is: 1
//Top of the stack after removing element: 4
//Size of the stack after removing element: 3
//4 2 3