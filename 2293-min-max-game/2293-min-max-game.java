class Solution {
    public int minMaxGame(int[] nums) {
        
        while(nums.length>1){
      
        int n=nums.length;
        int[] newnums=new int[n/2];
        for(int i=0;i<newnums.length;i++){
            if(i%2==0){
                newnums[i]=Math.min(nums[2 * i], nums[2 * i + 1]);   
            }
            else
                newnums[i]=Math.max(nums[2 * i], nums[2 * i + 1]);    
        }
            nums=newnums;
        }
        return nums[0];
    }
}