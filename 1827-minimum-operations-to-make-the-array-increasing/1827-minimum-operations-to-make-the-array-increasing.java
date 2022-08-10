class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(i==0)
                continue;
            if(nums[i]>nums[i-1])
                continue;
            else{
                count+=nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
        return count;
    }
}