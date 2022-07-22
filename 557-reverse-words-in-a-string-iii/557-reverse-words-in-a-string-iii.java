class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
       for(String word:s.split(" ")){
           char[] c = word.toCharArray();
           int i=0;
           int j=word.length()-1;
           while(i<j){
               char temp = c[i];
               c[i]=c[j];
               c[j]=temp;
               i++;
               j--;
           }
           String reversedword = new String(c);
           ans.append(" "+reversedword);
           
           
       } 
        return ans.toString().trim();
    }
}