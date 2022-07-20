package akm;

import java.util.Stack;

public class D14Q6b_MinStack {
    Stack < Long > st ;
    Long mini;

    public D14Q6b_MinStack() {
        st= new Stack <> ();
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.peek();
        if (val < mini) {
            mini = 2 * mini - val;
        }else{
            mini=mini;
        }
        st.pop();

    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();

    }
}
