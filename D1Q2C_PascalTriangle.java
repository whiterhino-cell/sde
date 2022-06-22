package akm;

import java.util.*;

public class D1Q2C_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            }
            pre = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        D1Q2C_PascalTriangle triangle=new D1Q2C_PascalTriangle();
        List<List<Integer>> tri=triangle.generate(5);

        for (List<Integer> row:tri ) {
            for (int ele :row) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
