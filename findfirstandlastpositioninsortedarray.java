class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=searchIndex(nums,target,true);
        ans[1]=searchIndex(nums,target,false);

        return ans;
    }
    public int searchIndex(int[] nums,int target,boolean isStartIndex){
        int n=nums.length;
        int left=0;
        int right=n-1;
        //default ans would be -1
        int ans=-1;
        //applying binary search
        while(left<=right){
            //find the middle 
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                //possible ans
                ans=mid;
                //if true search for start in leftSpace else search for end in rigthSpace
                if(isStartIndex)
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        return ans;
    }
}
