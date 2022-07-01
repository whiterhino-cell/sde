package akm;


public class D11Q3a_SingleElementIn_A_SortedArray {


    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int e = 0;
        for (int i = 0; i < n; i++) e = e ^ nums[i];
        return e;
    }
    public static void main(String args[]) {


        D11Q3a_SingleElementIn_A_SortedArray element =new D11Q3a_SingleElementIn_A_SortedArray();
        int arr1[] = {1,1,2,3,3,4,4,8,8};//2
        System.out.println(element.singleNonDuplicate(arr1));
        int arr2[] = {11,22,22,34,34,57,57}  ;//11
        System.out.println(element.singleNonDuplicate(arr2));
        int arr3[] = {3,3,7,7,10,11,11};//10
        System.out.println(element.singleNonDuplicate(arr3));
//        int arr4[] = {1,1,2,3,3,4,4,8,8};
//        System.out.println(element.singleNonDuplicate(arr4));
//        int arr5[] = {1,1,2,3,3,4,4,8,8};
//        System.out.println(element.singleNonDuplicate(arr5));

    }
}