class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1) return cost[0];
        int[] dp=new int[n];
        int f=cost[0];
        int sec=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(f,sec);
            f=sec;
            sec=dp[i];
        }
        return Math.min(f,sec);
    }
}