class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols = matrix[0].length;
        int left=0;
        int right=rows*cols-1;
        while(left<=right){
            int midpoint=left+(right-left)/2;
            int midelement=matrix[midpoint/cols][midpoint%cols];
            if(midelement==target)
                return true;
            else if(midelement>target){
                right=midpoint-1;
            }
            else if(midelement<target){
                left=midpoint+1;
            }
        }
        return false;
    }
}