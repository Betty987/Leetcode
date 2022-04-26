class Solution {
    public static boolean isPalindrome(int x) {
	int original=x;
    int reversed=0;
	if(x<0) {
		return false;
	}
	while(x>0) {
		reversed=reversed*10+x%10;
		x=x/10;
	}
	if(original==reversed) {
		return true;
	}
	else {
		return false;
		}
	
}
}