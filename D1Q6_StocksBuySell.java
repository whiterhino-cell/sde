package akm;

public class D1Q6_StocksBuySell {

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int profit=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]) profit+=arr[i+1]-arr[i];
        }
        System.out.println("profit : "+profit);
    }
}
