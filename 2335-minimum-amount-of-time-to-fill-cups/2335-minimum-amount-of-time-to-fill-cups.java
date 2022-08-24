class Solution {
    public int fillCups(int[] amount) {//very tricky
        int max=0,
            total=0;
        for(int cup:amount){
            total+=cup;
            max=Math.max(max,cup);
        }
        return Math.max(max,(total+1)/2);
    }
}