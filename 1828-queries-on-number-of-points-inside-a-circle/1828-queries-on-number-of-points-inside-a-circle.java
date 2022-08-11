class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int res[]= new int[queries.length];
        int i=0;
        
        for(int[] query:queries){
            int x=query[0],
                y=query[1],
                r=query[2],
                count=0;
            for(int[]point:points){
                if(valid(x,y,r,point)){
                    count++;
                }
            }
            res[i++]=count;
        }
        return res;
    }
    boolean valid(int x,int y,int r,int[] point){
        int x1=point[0],
            y1=point[1];
        return Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2)<=Math.pow(r,2);
    }
}