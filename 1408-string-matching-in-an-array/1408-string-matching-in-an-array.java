class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j) continue; //the word and the substring are the same.
                if(words[i].length()<=words[j].length()&&words[j].indexOf(words[i])>-1){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}