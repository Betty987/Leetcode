class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        //this will store how many ways there are to get to that step.
        dp[0]=1;//there is only 1 way
        dp[1]=1;//there is only 1 way
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}