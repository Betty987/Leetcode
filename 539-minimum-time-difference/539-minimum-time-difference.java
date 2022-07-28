class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] bucket = new boolean[1440];
        for(String timepoint:timePoints){
            String t[]=timepoint.split(":");
            int hours=Integer.parseInt(t[0]);
            int mins=Integer.parseInt(t[1]);
            int totalmins=hours*60+mins;
            if(bucket[totalmins]) return 0;
            bucket[totalmins]=true;
        }
        int min=Integer.MAX_VALUE;
        Integer prev=null,curr=null,first=null;
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]){
            if(prev==null){
                prev=i;
                first=i;
            }else{
                curr=i;
                min=Math.min(min,curr-prev);
                prev=curr;
            }
        }
        }
        return Math.min(min,1440-curr+first);
    }
    
}