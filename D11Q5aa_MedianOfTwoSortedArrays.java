package akm;

public class D11Q5aa_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length,n= nums2.length;
        int mid=m+n;
        int a,b;
        int a1=0,b1=0;
        if(mid%2==0) {
            a =mid/2;b=(mid/2)+1;
        }else {
            a = b = mid / 2;
        }
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                if (k==a)a1=nums1[a];
                if (k==b) {
                    b1 = nums1[b];
                    break;
                }
                k++;i++;
            } else {
                if (k==a)a1=nums2[a];
                if (k==b) {
                    b1 = nums2[b];
                    break;
                }
                k++;j++;
            }
        }
//        while(i<m) {
//            if (k==a)a1=nums1[a];
//            if (k==b) {
//                b1 = nums1[b];
//                break;
//            }
//            k++;i++;
//        }
//        while(j<n) {
//            if (k==a)a1=nums2[a];
//            if (k==b) {
//                b1 = nums2[b];
//                break;
//            }
//            k++;j++;
//        }


        return ((double)a1+(double)b1)/2.0;
    }

    public static void main(String args[]) {
        D11Q5aa_MedianOfTwoSortedArrays arrays=new D11Q5aa_MedianOfTwoSortedArrays();
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m=arr1.length;
        int n =arr2.length;
        System.out.print("The Median of two sorted array is ");
        System.out.printf("%.5f",arrays.findMedianSortedArrays(arr1,arr2));
    }
}
