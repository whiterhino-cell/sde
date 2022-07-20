package akm;

public class D13Q1_ImplementStackUsingArray {

    int size;
    int arr[];
    int top;

    public D13Q1_ImplementStackUsingArray(){
        size=10;
        arr=new int[size];
        top=-1;
    }

    public D13Q1_ImplementStackUsingArray(int size) {
        this.size = size;
        arr=new int[size];
        top=-1;
    }

    public void push(int var){
        if ((top+1)<size)
            arr[++top]=var;
        else
            System.out.println("Stack Overflow");
    }
    public void pop(){
        if (top>=0)
            top--;
        else
            System.out.println("Stack Underflow");
    }
    public  int top(){
        return arr[top];
    }
    public int size(){
         return   top+1;
    }
    public  boolean isEmpty(){
       return (top==-1);
    }

    public static void main(String[] args) {

        D13Q1_ImplementStackUsingArray stackUsingArray=new D13Q1_ImplementStackUsingArray();

        stackUsingArray.push(13);
        stackUsingArray.push(5);
        System.out.println(stackUsingArray.top());
        System.out.println(stackUsingArray.isEmpty());
        System.out.println(stackUsingArray.size());
        stackUsingArray.push(69);
        stackUsingArray.pop();
        System.out.println(stackUsingArray.size());
        stackUsingArray.pop();
        System.out.println(stackUsingArray.isEmpty());
        System.out.println(stackUsingArray.size());
        stackUsingArray.pop();
        System.out.println(stackUsingArray.isEmpty());

    }
}
//push(val)
//pop()
//top()
//size()
//isEmpty()