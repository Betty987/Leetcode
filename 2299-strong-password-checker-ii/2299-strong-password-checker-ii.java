class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        boolean lower=false,
                upper=false,
                digit=false,
                special=false;
        HashSet<Character> set = new HashSet(Arrays.asList('!','@','#','$','%','^','&','*','(',')','-','+','"'));
        for(int i=0;i<password.length();i++){
            char curr=password.charAt(i);
            char prev=(i>0)?password.charAt(i-1):' ';
            if(curr==prev) return false;
            if(curr>='a' && curr<='z')
                lower = true;
            if(curr>='0' && curr<='9')
                digit = true;
            if(curr>='A' && curr<='Z')
                upper = true;
            if(set.contains(curr))
                special = true;
            
        }
        return lower&&upper&&digit&&special;
    }
}