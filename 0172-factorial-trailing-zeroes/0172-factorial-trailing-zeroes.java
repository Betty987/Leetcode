class Solution {
    public int trailingZeroes(int n) {//the trick is to count how many 5's we can get by diving the number
        //if it is 25! we have 6 trailing zeros how?? since 25/5==5 then 5/5=1 so 5+1=6
        int count = 0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        return count;
        
        
    }
}