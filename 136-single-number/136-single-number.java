class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else
                set.remove(nums[i]);
        }
        for(int i:set)
            return i;
        return -1;
    }
}