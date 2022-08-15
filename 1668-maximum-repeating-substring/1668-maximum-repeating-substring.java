class Solution {
    public int maxRepeating(String sequence, String word) {
        String tobefound=word;
        int ans=0;
        while(sequence.contains(tobefound)){
            tobefound+=word;
            ans++;
        }
        return ans;
    }
}