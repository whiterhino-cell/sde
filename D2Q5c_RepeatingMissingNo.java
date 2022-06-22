package akm;

import java.util.Scanner;

public class D2Q5c_RepeatingMissingNo {
    static int[] getTwoElements(int arr[], int n) {
        int xor1,set_bit_no, i;
        int x = 0,y = 0;
        xor1 = arr[0];
//        xor with curr then whole array
        for (i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];
        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;
        set_bit_no = xor1 & ~(xor1 - 1);
        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)
                x = x ^ arr[i];
            else
                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)
                x = x ^ i;
            else
                y = y ^ i;
        }
        int[] ans=new int[2];
        for (int j = 0; j < n; j++) {
            if (arr[j]==y){
                ans[0]=x;ans[1]=y;
            }else if (arr[j]==x){
                ans[0]=y;ans[1]=x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int arr[] = {3, 4, 1, 5, 1, 6, 2};
//        int arr[] = {1,2,4,4,5,6,7};
//      int[] arr = {7, 3, 4, 5, 7, 6, 2};
//        int[] arr = {3,1,2,5,3};
//        int arr[] ={3,1,2,5,4,6,7,5};
        int arr[] = {1,2,3,4,5,6,9,8,9,10};

        int n = arr.length;

        int[] ans=getTwoElements(arr, n);

        System.out.println(ans[1]+" "+ans[0]);

        System.out.println(" The missing element =  " + ans[0]);
        System.out.println(" The repeating  element =  " + ans[1]);
        Scanner s=new Scanner(System.in);
        int nn= s.nextInt();
        int[] a=new int[nn];
        for (int i = 0; i < nn; i++) {
            a[i]= s.nextInt();
        }
        int[] anss=getTwoElements(a, nn);

        System.out.println(anss[1]+" "+anss[0]);
    }

}
