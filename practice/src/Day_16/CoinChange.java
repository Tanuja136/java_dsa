package Day_16;

import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of coins : ");
        int n = sc.nextInt();
        System.out.print("enter the coins : ");
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.print("enter target amount: ");
        int amount = sc.nextInt();
        
        int result = coinChange(coins, amount);
        System.out.println(result);
    }

    public static int coinChange(int[] coins, int amount) {
    	
        int max = amount + 1; // if amount = 11 then max = 12
        
        int[] dp = new int[amount + 1]; //1 - based index
        Arrays.fill(dp, max);  // initially fill the dp as 12
        dp[0] = 0; //suppose  0 : 0
        for (int i = 1; i <= amount; i++) { // 1  to  11
            for (int coin : coins) {        // 1 2 5
                if (i - coin >= 0) {         //0 -1 -4
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);  //12 , 0+1 = min(12 , 1) = dp[1] = 1
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}