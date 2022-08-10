class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int [] smallgrid:grid){
            for(int i:smallgrid){
                if(i<0)
                    count++;
            }
        }
        return count;
    }
}