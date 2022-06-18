class Solution{
	//a palindrome is a word that reads the same forward and backwards
    public boolean isPalindrome(String s) {
        String clean_string = "";
        for(char c:s.toCharArray()) {//for every character in the chararray
        	if(Character.isDigit(c)||Character.isLetter(c)) {//if it is a digit or a letter add it to the string
        			clean_string+=c;
        	}
        }
        clean_string=clean_string.toLowerCase();
        
        int a_pointer = 0;
        int b_pointer = clean_string.length()-1;
        while(a_pointer<b_pointer) {
        	if(clean_string.charAt(a_pointer)!=clean_string.charAt(b_pointer)) {
        		return false;
        	}
        	a_pointer++;
        	b_pointer--;
        }
        
        return true;
    }
}
