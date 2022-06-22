package akm;

public class D1Q3b_next_permutation {
    public void nextPermutation(int[] A) {
        if(A == null || A.length <= 1) return;

        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1])
            i--; //breaking point

        for (i = A.length - 2;(i >= 0 && A[i] >= A[i + 1]); i--);


        if(i >= 0) {
            int j = A.length - 1;
            while(A[j] <= A[i]) j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, A.length - 1);
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }

    public static void main(String[] args) {
        D1Q3b_next_permutation permutation=new D1Q3b_next_permutation();
        int Arr[] = {1,3,2};
        for (int x : Arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        permutation.nextPermutation(Arr);
        for (int x : Arr) {
            System.out.print(x+" ");
        }
    }
}
