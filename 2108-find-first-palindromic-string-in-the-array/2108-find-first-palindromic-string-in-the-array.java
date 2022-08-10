class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
           if(isPalindrome(word))
               return word;
        }
        return "";
    }
    
    boolean isPalindrome(String s){
        char[] w=s.toCharArray();
         int a=0;
         int b=w.length-1;
         while(a<b){
                if(w[a]==w[b]){
                    a++;
                    b--;
                }
             else{
                 return false;
             }
            }
        return true;
        
        
    }
}