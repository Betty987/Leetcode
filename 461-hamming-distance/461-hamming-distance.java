class Solution {
    public int hammingDistance(int x, int y) {

        //integer.bitCount gets the number of 1s in the binary representation of a number
        return Integer.bitCount(x^y);
    }
}
