class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count=new int[101];
  for(int num:nums){
      count[num]++;
  }
  for(int i=1;i<count.length;i++){
      count[i]+=count[i-1];
  }
  for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
          nums[i]=count[nums[i]-1];
      }
  }
        return nums;
}
}