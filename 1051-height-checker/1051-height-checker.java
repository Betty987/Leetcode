class Solution {
    public int heightChecker(int[] heights) {
        int res=0;
        int[] clone= heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(clone[i]!=heights[i]){
                res++;
            }
        }
        return res;
    }
}