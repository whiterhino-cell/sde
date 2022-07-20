package akm;

import java.util.Stack;

public class D14Q4bb_LargestRectangleInHistogram {
    static int largestRectangleArea(int heights[]) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }

    public static void main(String args[]) {
        int histo[] = {3, 1, 5, 6, 2, 3};
        System.out.println( largestRectangleArea(histo));
    }
}
