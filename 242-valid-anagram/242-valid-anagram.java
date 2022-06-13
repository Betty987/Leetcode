
class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) return false;//if the length is not equal it is not anagram
        int count_letters[] = new int[26];
        for(int i=0;i<s.length();i++){
            count_letters[s.charAt(i)-'a']++;
            count_letters[t.charAt(i)-'a']--;
        }
        for(int count:count_letters) {
        	if(count!=0)return false;
        }
        return true;
    }
}
