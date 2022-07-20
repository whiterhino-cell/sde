package akm;

import java.util.Stack;

public class D13Q5_CheckForBalancedParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty())
                    return false;
                char ch = st.pop();
                if((ch == '('&& it == ')' ) ||  (ch == '['&& it == ']' ) || ( ch == '{'&& it == '}' ))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main (String[] args) {
        D13Q5_CheckForBalancedParentheses parentheses=new D13Q5_CheckForBalancedParentheses();

        String s="()[{}()]";
        if(parentheses.isValid(s)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
