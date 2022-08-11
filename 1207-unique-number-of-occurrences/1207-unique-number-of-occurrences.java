class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        int[]count=new int[2000+2];
        for(int num:nums){
            count[num+1000]++;//why we add 1000 because the index might be negative
        }
        HashSet<Integer> set = new HashSet();
        for(int num:count){
            if(!set.add(num)&&num!=0)
                return false;
        }
        return true;
    }
}