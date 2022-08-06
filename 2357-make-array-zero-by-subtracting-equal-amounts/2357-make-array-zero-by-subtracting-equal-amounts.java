class Solution {
    //time=O(n)
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);//add zero to the set
        for(int i:nums){
            set.add(i);
        }
        return set.size()-1;//to ignore 0
        
    }
}