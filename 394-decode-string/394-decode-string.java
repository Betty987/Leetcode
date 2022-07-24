class Solution {
    public String decodeString(String s) {
        Stack<String> wordStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        int number = 0;
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number *10 + (c-'0');//c-0 turns the char to int
            }
            else if(Character.isLetter(c)){
                word.append(c);
                
            }
            else if(c=='['){
                wordStack.push(word.toString());
                countStack.push(number);
                number=0;
                word = new StringBuilder();
                
            }
            else{
                int countpop = countStack.pop();
                StringBuilder wordpop = new StringBuilder(wordStack.pop());
                for(int j=1;j<=countpop;j++){
                   wordpop.append(word);
                }
                word=wordpop;
                
            }
        }
        return word.toString();
    }
}