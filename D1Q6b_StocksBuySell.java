package akm;

public class D1Q6b_StocksBuySell {
    static public int maxProfit(int[] prices) {
        int maxP=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if (prices[i]<min)  min=prices[i];
            if(prices[i]-min>maxP) maxP=prices[i]-min;
        }
        return maxP;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
