package akm;

public class D2Q6c_InversionOfArray {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long x = msort(arr,0,arr.length-1);
        return x;
    }
    public static long  msort(long[]arr,int low,int high){
        long c=0;
        if (low<high){
            int mid=low+(high-low)/2;
            c=c+msort(arr,low,mid);
            c=c+msort(arr,mid+1,high);
            c=c+mergerFun(arr,low,mid,high);
        }
        return c;
    }
    private static long mergerFun(long[] arr, int low, int mid, int high) {
        long res=0;
        int n=mid-low+1;
        int m=high-mid;
        long []temp1=new long[n];
        long []temp2=new long[m];
        for (int i = 0; i < n; i++) {
            temp1[i]=arr[low+i];
        }
        for (int i = 0; i < m; i++) {
            temp2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while (i<n && j<m){
            if (temp1[i]<=temp2[j]){
                arr[k++]=temp1[i++];
            }else {
                arr[k++]=temp2[j++];
                res=res+(n-i);
            }
        }
        while (i<n){
            arr[k++]=temp1[i++];
        }
        while (j<m){
            arr[k++]=temp2[j++];
        }
        return res;
    }
}


