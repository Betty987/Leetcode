class Solution {
    public int[] diStringMatch(String s) {
        int size=s.length();
        int low=0;
        int high=size;
        int out[] = new int[size+1];//the array size is s.length+1
        for(int i=0;i<size;i++){
            if(s.charAt(i)=='I'){
                out[i]=low;
                low++;
            }
            else if(s.charAt(i)=='D'){
                out[i]=high;
                high--;
            }
            
        }
        out[size]=high;//that extra element
        return out;
    }
}