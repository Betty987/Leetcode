class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] t=text.split(" ");
        int total=t.length;
        for(String word:t){
            for(char c:brokenLetters.toCharArray()){
                 if(word.contains(c+"")){
                    total=total-1;
                    break;
                }
            }
                
        }
        
      return total;  
    }
}