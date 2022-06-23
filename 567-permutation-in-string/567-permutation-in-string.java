class Solution{
    public boolean checkInclusion(String s1, String s2) {
        int[] s1hash=new int[26];
        int[] s2hash=new int [26];
        int s1len=s1.length();
        int s2len=s2.length();
        if(s1len>s2len)//if length of s1 is greater than s2,it won't have any permutation contained in s2
        	return false;
        int left=0,right=0;
        while(right<s1len) {
        	s1hash[s1.charAt(right)-'a']+=1;
        	s2hash[s2.charAt(right)-'a']+=1;
        	right+=1;
        }
        right-=1;//
        while(right<s2len) {
        	if(Arrays.equals(s1hash, s2hash))
        		return true;
        	right+=1;
        	if(right!=s2len)
        		s2hash[s2.charAt(right)-'a']+=1;
        	s2hash[s2.charAt(left)-'a']-=1;
        	left+=1;
        }
        
        
      return false;  
    }
}

