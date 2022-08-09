class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        int countspace=0;
        for(char c:s.toCharArray()){
            if(c==' '){
                countspace++;
            }
            if(countspace==k){
                break;
            }
            str.append(c);
            
        }
        return str.toString();
    }
}