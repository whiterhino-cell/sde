package akm;

public class D11Q5a_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length,n= nums2.length;
        int finalArray[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                finalArray[k++] = nums1[i++];
            }
            else {
                finalArray[k++] = nums2[j++];
            }
        }
        while(i<m)
            finalArray[k++] = nums1[i++];
        while(j<n)
            finalArray[k++] = nums2[j++];

        n = n+m;
        if(n%2==1)
            return finalArray[((n+1)/2)-1];
        else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
    }

    public static void main(String args[]) {
        D11Q5a_MedianOfTwoSortedArrays arrays=new D11Q5a_MedianOfTwoSortedArrays();
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m=arr1.length;
        int n =arr2.length;
        System.out.print("The Median of two sorted array is ");
        System.out.printf("%.5f",arrays.findMedianSortedArrays(arr1,arr2));
    }
}
