class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String c:operations){
            if(c.equals("--X") || c.equals("X--")){
                X-=1;
            }
            else if(c.equals("++X")||c.equals("X++")){
                X+=1;
            }
        }
        return X;
    }
}