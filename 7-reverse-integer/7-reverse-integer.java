class Solution {
    public int reverse(int number) {
        boolean isnegative=number<0;
        if(isnegative){
            number=number*-1;
        }
        int lastdigit;
        long reverse=0;
        while(number>0){
            lastdigit=number%10;
            reverse=reverse*10+lastdigit;
            number=number/10;
        }
        if(reverse>Integer.MAX_VALUE) return 0;
        return isnegative?(int)reverse*-1:(int)reverse;
    }
}