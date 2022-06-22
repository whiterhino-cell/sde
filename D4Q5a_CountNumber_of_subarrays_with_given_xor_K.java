package akm;

public class D4Q5a_CountNumber_of_subarrays_with_given_xor_K {
    public int solve(int[] A, int B) {
        int c=0;
        for(int i=0;i<A.length;i++){
            int current_xor = 0;
            for(int j=i;j<A.length;j++){
                current_xor^=A[j];
                if(current_xor==B) c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        D4Q5a_CountNumber_of_subarrays_with_given_xor_K xor_k
                =new D4Q5a_CountNumber_of_subarrays_with_given_xor_K();

        System.out.println(xor_k.solve(new int[]{4, 2, 2, 6, 4},6));
    }
}
