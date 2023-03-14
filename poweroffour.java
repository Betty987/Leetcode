class Solution {
  public boolean isPowerOfFour(int n) {
    
    return n%4==0 && isPowerOfFour(n/4) ;
  }
}
