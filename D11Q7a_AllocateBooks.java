package akm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class D11Q7a_AllocateBooks {
    static boolean isPossible(ArrayList< Integer > A, int mid, int students) {
        int cnt = 1;
        int sumAllocated = 0;
        for (int i = 0; i < A.size(); i++) {
            if (sumAllocated + A.get(i) <= mid) {
                sumAllocated += A.get(i);
            } else {
                cnt++;
                sumAllocated = A.get(i);
                if (sumAllocated > mid) return false;
            }
        }
        if (cnt <= students) return true;
        return false;
    }
    public static int books(ArrayList < Integer > A, int B) {
        if (B > A.size()) return -1;
        int low = A.get(0);
        int high = 0;
        for (int i = 0; i < A.size(); i++) {
            high = high + A.get(i);
            low = Math.min(low, A.get(i));
        }
        System.out.println(low+" : "+high);
        int res = -1;
        while (low <= high) {
            int mid = low+(high-low)/2;
             if (isPossible(A, mid, B)) {
                 res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    public static void main(String args[]) {
        ArrayList < Integer > A = new ArrayList < > ();
        A.add(12);
        A.add(34);
        A.add(67);
        A.add(90);
        int B = 2;
        System.out.println("Minimum Possible Number is " + books(A, B));
        A=new ArrayList<>(Arrays.asList(73, 58, 30, 72, 44, 78, 23, 9));
        System.out.println("Minimum Possible Number is " + books(A, 5));//110

    }
}
