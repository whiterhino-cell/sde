package akm;

public class D13Q2_ImplementQueueUsingArray {
    private int arr[];
    private int left, right, currSize, maxSize;
    public D13Q2_ImplementQueueUsingArray() {
        arr = new int[16];
        left = -1;
        right = -1;
        currSize = 0;
    }

    public D13Q2_ImplementQueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        left = -1;
        right = -1;
        currSize = 0;
    }

    public void push(int newElement) {
        if (currSize == maxSize) {
            System.out.println("Queue is full\nExiting...");
            return;
        }
        if (right == -1) {
            left = 0;
            right = 0;
        } else {
            right = (right + 1) % maxSize;
        }
        arr[right] = newElement;
//        System.out.println("The element pushed is " + newElement);
        currSize++;
    }
    public int pop() {
        if (left == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[left];
        if (currSize == 1) {
            left = -1;
            right = -1;
        } else
            left = (left + 1) % maxSize;
        currSize--;
        return popped;
    }
    public int top() {
        if (left == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[left];
    }
    public int size() {
        return currSize;
    }
    public static void main(String args[]) {
        D13Q2_ImplementQueueUsingArray q = new D13Q2_ImplementQueueUsingArray(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
