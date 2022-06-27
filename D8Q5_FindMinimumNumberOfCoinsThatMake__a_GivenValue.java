package akm;

import java.util.ArrayList;

public class D8Q5_FindMinimumNumberOfCoinsThatMake__a_GivenValue {
    public static int findMinimumCoins(int amount) {
        ArrayList< Integer > ans = new ArrayList < > ();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = coins.length;
        for (int i = n - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("The coins are ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.get(i));
        }
        System.out.println();

        return ans.size();
    }

    public static void main(String[] args) {
        int ans=D8Q5_FindMinimumNumberOfCoinsThatMake__a_GivenValue.findMinimumCoins(49);
        System.out.println("The minimum number of coins is "+ans);
    }
}
