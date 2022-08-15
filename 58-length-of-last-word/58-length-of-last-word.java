class Solution {
    public int lengthOfLastWord(String s) {
        String [] word = s.split(" ");
        String lastword = word[word.length-1];
        int count=0;
        for(char c:lastword.toCharArray()){
            count++;
        }
      return count;  
    }
}