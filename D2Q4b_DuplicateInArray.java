package akm;

public class D2Q4b_DuplicateInArray {
    public int findDuplicate(int[] arr){
        int l= arr.length;
        int f[]=new int[l+1];
        for (int i = 0; i <=l; i++) {
            if (f[arr[i]]==0) f[arr[i]]++;
            else return arr[i];
        }

        return 0;
    }
    public static void main(String args[]) {
        int arr[] = {1,3,4,2,1};
        D2Q4b_DuplicateInArray inArray=new D2Q4b_DuplicateInArray();
        System.out.println("The duplicate element is " + inArray.findDuplicate(arr));
    }
}
