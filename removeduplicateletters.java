class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        boolean[] visited=new boolean[26];
        int[] lastindex=new int[26];
        for(int i=0;i<n;i++){
            lastindex[s.charAt(i)-'a']=i;
        }
        Stack<Integer>stack = new Stack();
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            if(visited[c])continue;
            visited[c]=true;
            while(!stack.isEmpty()&&stack.peek()>c&&lastindex[stack.peek()]>i){
                visited[stack.pop()]=false;
            }
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append((char)(stack.pop()+'a'));
        }
        return ans.reverse().toString();
            
        

    }
}
