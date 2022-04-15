class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nummap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(nummap.containsKey(complement)){
                return new int[]{nummap.get(complement),i};
            }
            nummap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}