class Solution {
    
    public int coinChange(int[] coins, int amount) {
     int [] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for (int coin: coins)
        {
            for (int j = coin; j < amount+1; j++)
            {
                dp[j] = Math.min(dp[j], 1+dp[j-coin]);
            }
        }
        if (dp[amount] > amount)
        {
            return -1;
        }
        else{
            return dp[amount];
        }
    }

    
}