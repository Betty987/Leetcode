class Solution {
    public String sortSentence(String s) {
     HashMap<Integer,String> map = new HashMap<>();//hashmap
        for(String word:s.split(" ")){//for every word split by space
       
         int index= word.charAt(word.length()-1);//last index of the word
         String actualword= word.substring(0,word.length()-1);
         map.put(index,actualword);
        }
        
        StringBuilder actualstring = new StringBuilder();
        for(Map.Entry<Integer,String> ind : map.entrySet()){
            actualstring.append(ind.getValue());
            actualstring.append(" ");
        }
        return actualstring.toString().trim();//a string builder has to be converted to string
    }
}