class Solution {
    public int rob(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[nums.length];
        dp[0]=nums[0];//the money we make upto 0th house
        dp[1]=Math.max(nums[0],nums[1]);//the money that we make upto the 1st house
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];//the last element will store the largest sum
    }
}