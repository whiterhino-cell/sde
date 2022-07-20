package akm;

public class D11Q5b_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length,n= nums2.length;
        if(m>n)
            return findMedianSortedArrays(nums2,nums1);//ensuring that binary search happens on minimum size array

        int low=0,high=m,medianPos=((m+n)+1)/2;
        while(low<=high) {
            int cut1 = (low+high)>>1;
            int cut2 = medianPos - cut1;

            int l1 = (cut1 == 0)? Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = (cut2 == 0)? Integer.MIN_VALUE:nums2[cut2-1];
            int r1 = (cut1 == m)? Integer.MAX_VALUE:nums1[cut1];
            int r2 = (cut2 == n)? Integer.MAX_VALUE:nums2[cut2];

            if(l1<=r2 && l2<=r1) {
                if((m+n)%2 != 0)
                    return Math.max(l1,l2);
                else
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high = cut1-1;
            else low = cut1+1;
        }
        return 0.0;
    }

    public static void main(String args[]) {
        D11Q5b_MedianOfTwoSortedArrays arrays=new D11Q5b_MedianOfTwoSortedArrays();
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m=arr1.length;
        int n =arr2.length;
        System.out.print("The Median of two sorted array is ");
        System.out.printf("%.5f",arrays.findMedianSortedArrays(arr1,arr2));
    }
}
