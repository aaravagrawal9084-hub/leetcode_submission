class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return Stairs(n,dp);

    }
    public int Stairs(int n,int[] dp) {
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] = Stairs(n-1,dp) + Stairs(n-2,dp);

    }
}