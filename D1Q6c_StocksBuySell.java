package akm;

public class D1Q6c_StocksBuySell {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int min=prices[0];
        for(int pp:prices){
            min=Math.min(min,pp);
            maxP=Math.max(pp-min,maxP);
        }
        return maxP;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        D1Q6c_StocksBuySell sell=new D1Q6c_StocksBuySell();
        int maxPro = sell.maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
