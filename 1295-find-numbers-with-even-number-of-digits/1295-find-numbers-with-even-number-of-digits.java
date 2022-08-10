class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int evendigit=0;
        for(int num:nums){
            String s=String.valueOf(num);
            for(char c:s.toCharArray()){
                count++;
                
            }
            if(count%2==0)
                evendigit++;
            count=0;
        }
        return evendigit;
    }
}