class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=0;
        int gcd=0;
        Arrays.sort(nums);
        min=nums[0];
        max=nums[nums.length-1];
        return gcd(max,min);
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else 
            return gcd(b,a%b);
    }
}