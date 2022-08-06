class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] frequency=new int[101];
        for(int i:nums){
            frequency[i]++;
        }
        int[] res=new int[2];
        for(int j:frequency){
            res[0]+=j/2;//this will get the pairs
            res[1]+=j%2;//this will get the leftover
        }
        return res;
    }
}