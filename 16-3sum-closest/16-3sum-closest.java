class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //time=O(n^2)
        //space=O(1)
        //we need to return the sum that is closest to the target
        //target=sum+diff
        int diff=Integer.MAX_VALUE;//diff=target-sum
        Arrays.sort(nums);//O(nlogn)
        for(int i=0;i+2<nums.length;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){//O(n)
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff=target-sum;
                }
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
                    
            }
        }
        return target-diff;
    }
}