class Solution {
    public String reversePrefix(String word, char ch) {
        String prefix = word.substring(0,word.indexOf(ch)+1);
        String suffix = word.substring(word.indexOf(ch)+1,word.length());
        
        StringBuilder sb = new StringBuilder(prefix);
        sb.reverse();
        sb.append(suffix);
        return sb.toString();
    }
}