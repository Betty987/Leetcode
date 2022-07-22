class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
         vowels.add('E');
         vowels.add('e');
         vowels.add('I');
         vowels.add('i');
         vowels.add('O');
         vowels.add('o');
         vowels.add('U');
         vowels.add('u');
        char[] c = s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            while(i<j&&!vowels.contains(c[i])){
                i++;
            }
            while(j>i&&!vowels.contains(c[j])){
                j--;
            }
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
            
        }
        return String.valueOf(c);
    }
}