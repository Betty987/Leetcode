class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arraylen=0;
        for(int i=0;i<nums.length;i+=2){
            arraylen+=nums[i];
        }
        int[] ans=new int[arraylen];
        int startindex=0;
        for(int i=0;i<nums.length;i+=2){//at the even index tells you the frequency
           Arrays.fill(ans,startindex,startindex+nums[i],nums[i+1]);
           startindex+=nums[i];
        }
        return ans;
    }
}