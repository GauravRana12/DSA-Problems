class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] ch1=text1.toCharArray();
        char[] ch2=text2.toCharArray();
         int[][] dp=new int[ch1.length+1][ch2.length+1];
        
        lcs(ch1,ch2,dp);
        return dp[ch1.length][ch2.length];
    }
    public static void lcs(char[] ch1,char[] ch2,int[][] dp){
        for(int i=1;i<=ch1.length;i++){
            for(int j=1;j<=ch2.length;j++){
                if(ch1[i-1]==ch2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
    }
}