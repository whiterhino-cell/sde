package akm;

import java.util.Arrays;

public class D2Q4a_DuplicateInArray {

    public int findDuplicate(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = {1,3,4,2,2};
        D2Q4a_DuplicateInArray array=new D2Q4a_DuplicateInArray();
        System.out.println("The duplicate element is " + array.findDuplicate(arr));
    }
}
