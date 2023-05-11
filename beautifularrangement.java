class Solution {
     int count=0;
    public int countArrangement(int n) {
       
        int nums[] = new int[n+1];//index has to start from 1
        permute(nums,1,n);
       
        return count;
    }
    void permute(int[] nums,int val,int n){
        if(val>n){
            count++;
            return;
    }
        for(int i=1;i<=n;i++){
            //if not filled or one of the conditions is satisfied
            if(nums[i]==0&&(val%i==0 || i%val==0)){
                nums[i]=val;
                permute(nums,val+1,n);
                nums[i]=0;

            }
        }
    }
}
