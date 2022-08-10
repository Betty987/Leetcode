class Solution {
    //time=O(N*k)//n is the number of words and k is the number of letters in word
    //space=O(N)//because we used a hashset
    
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set= new HashSet();
        
        for(String w:words){
            StringBuilder morsecode=new StringBuilder();
            for(char c:w.toCharArray()){
                morsecode.append(morse[c-'a']);
            }
            set.add(morsecode.toString());
        }
        return set.size();
    }
}