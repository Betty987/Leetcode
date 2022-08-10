class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int min=0;
        int ans =0;
        int maxLength=0;
        for(int [] rec:rectangles){
           
           min=Math.min(rec[0],rec[1]);
           if(maxLength<min){
               maxLength=min;
               ans=1;
           }
           else if(maxLength==min){
               ans++;
           }
           
        }
        return ans;
    }
}