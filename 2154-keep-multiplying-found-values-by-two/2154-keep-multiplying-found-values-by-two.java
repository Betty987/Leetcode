class Solution {
    public int findFinalValue(int[] nums, int original) {
        //time=(nlogn)since we are sorting nlogn
        //space=O(1)
        Arrays.sort(nums);
        for(int num:nums){
            if(original==num){
                original*=2;
            }
        }
        return original;
    }
}