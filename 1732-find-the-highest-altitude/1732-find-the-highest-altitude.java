class Solution {
    public int largestAltitude(int[] gain) {
        int maxalt=0;
        int alt=0;
        for(int climb:gain){
            alt+=climb;
            maxalt=Math.max(maxalt,alt);
                
        }
        return maxalt;
    }
}