class Solution {
    public String reverseOnlyLetters(String s) {
        //time=O(n)
        //space=O(n)
        char[] c = s.toCharArray();
        int a_pointer=0;
        int b_pointer=c.length-1;
        while(a_pointer<=b_pointer){
            while(a_pointer<b_pointer && !Character.isLetter(c[a_pointer])){
                a_pointer++;
            }
            while(b_pointer>a_pointer && !Character.isLetter(c[b_pointer])){
                b_pointer--;
            }
            char temp=c[a_pointer];
            c[a_pointer]=c[b_pointer];
            c[b_pointer]=temp;
            a_pointer++;
            b_pointer--;
            
        }
        return new String(c);
    }
}