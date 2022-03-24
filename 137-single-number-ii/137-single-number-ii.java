class Solution {
    public int singleNumber(int[] nums) {
        long setsum=0;
        long numssum=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int x:nums){
            numssum+=x;
            if(set.contains(x)){
                continue;
            }
            setsum+=x;
            set.add(x);
        }
        return (int)((setsum*3-numssum)/2);
    }
}


