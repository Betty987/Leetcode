class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char i:s.toCharArray()){
            if(i!='#')
                sStack.push(i);
            else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }
        for(char i:t.toCharArray()){
            if(i!='#')
                tStack.push(i);
            else if(!tStack.isEmpty()){
                tStack.pop();
            }
        }
        
        while(!sStack.isEmpty()){
            char sTop = sStack.pop();
            if(tStack.isEmpty()||tStack.pop()!=sTop)
                return false;
        }
        return sStack.isEmpty()&&tStack.isEmpty();
    }
}