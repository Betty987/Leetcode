class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] alphabets=new int[26];
        for(char c:sentence.toCharArray()){
           alphabets[c-'a']++;
        }
       
        for(int num:alphabets){
            if(num==0) return false;
        }
        return true;
    }
}