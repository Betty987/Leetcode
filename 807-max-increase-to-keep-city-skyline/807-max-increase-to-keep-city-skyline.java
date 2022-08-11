class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        //time=O(n*m)
        //space=O(max(n,m))
        int res=0;
        int n=grid.length;
        int m=grid[0].length;
        int row[]=new int[n];//each element will hold the maximum in that row
        int col[]=new int[m];//each element will hold the maximum in that col
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row[i]=Math.max(row[i],grid[i][j]);
                col[j]=Math.max(col[j],grid[i][j]);
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               res+=Math.min(row[i],col[j])-grid[i][j];
                
            }
        }
        return res;
        
    }
}