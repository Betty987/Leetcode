class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length==1){//if we only have 1 element in the array it is the majority element
           return nums[0];
       } 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)&&map.get(i)+1>nums.length/2)
                return i;
            else
             map.put(i,map.getOrDefault(i,0)+1);
        }
         return -1;   
    }
}