package akm;

public class D11Q7b_AllocateBooks {
    static boolean isPossible(int[]A, int mid, int students) {
        int cnt = 1;
        int sumAllocated = 0;
        for (int i = 0; i < A.length; i++) {
            if (sumAllocated + A[i] <= mid) {
                sumAllocated += A[i];
            } else {
                cnt++;
                sumAllocated = A[i];
                if (sumAllocated > mid) return false;
            }
        }
        if (cnt <= students) return true;
        return false;
    }
    public static int books(int[] A, int B) {
        if (B > A.length) return -1;
        int low = A[0];
        int high = 0;
        for (int i = 0; i < A.length; i++) {
            high = high + A[i];
            low = Math.min(low, A[i]);
        }
        while (low <= high) {
            int mid = (low + high) >> 1;
             if (isPossible(A, mid, B))
                high = mid - 1;
             else
                low = mid + 1;
        }

        return low;
    }
    public static void main(String args[]) {
//        ArrayList < Integer > A = new ArrayList < > ();
//        A.add(12);
//        A.add(34);
//        A.add(67);
//        A.add(90);
        int[] A=new int[]{12,34,67,90};
        int B = 2;
        System.out.println("Minimum Possible Number is " + books(A, B));
        System.out.println("Minimum Possible Number is " + books(new int[]{ 73, 58, 30, 72, 44, 78, 23, 9}, 5));//110
    }
}
