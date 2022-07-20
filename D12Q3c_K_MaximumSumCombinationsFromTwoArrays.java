package akm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class D12Q3c_K_MaximumSumCombinationsFromTwoArrays {
    public static void MaxPairSum(Integer[] A, Integer[] B, int N, int K) {
        // sort both arrays A and B
        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<PairSum> sumsPQ = new PriorityQueue<PairSum>();
        HashSet<Pair> pairsPQ = new HashSet<Pair>();

        int t = N - 1;
        int b = N - 1;
        pairsPQ.add(new Pair(t, b));
        sumsPQ.add(new PairSum(A[t] + B[b], t, b));

        for (int i = 0; i < K; i++) {
            PairSum max = sumsPQ.poll();
            System.out.println(max.sum);
            t = max.t - 1;
            b = max.b;

            if (t >= 0 && b >= 0 && !pairsPQ.contains(new Pair(t, b))) {

                sumsPQ.add(new PairSum(A[t] + B[b], t, b));
                pairsPQ.add(new Pair(t, b));
            }

            t = max.t;
            b = max.b - 1;

            if (t >= 0 && b >= 0 && !pairsPQ.contains(new Pair(t, b))) {

                sumsPQ.add(new PairSum(A[t] + B[b], t, b));
                pairsPQ.add(new Pair(t, b));
            }
        }
    }

    public static void main(String[] args) {
        Integer A[] = { 1, 4, 2, 3 };
        Integer B[] = { 2, 5, 1, 6 };
        int N = A.length;
        int K = 4;

        // Function Call
        MaxPairSum(A, B, N, K);
    }

    public static class Pair {
        int t;
        int b;
        public Pair(int t, int b) {
            this.t = t;
            this.b = b;
        }
    }

    public static class PairSum implements Comparable<PairSum> {
        int sum;
        int t;
        int b;
        public PairSum(int sum, int t, int b) {
            this.sum = sum;
            this.t = t;
            this.b = b;
        }

        @Override public int compareTo(PairSum o) {
            return Integer.compare(o.sum, sum);
        }
    }
}
