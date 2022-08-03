class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        Stack<Integer> stack=new Stack<>();//this stack stores the indexes
        int [] leftsmaller = new int[n];
        int [] rightsmaller = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) leftsmaller[i]=0;
            else leftsmaller[i]=stack.peek()+1;
            stack.push(i);
        }
        while(!stack.isEmpty()){//clean the stack for the next use
            stack.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) rightsmaller[i]=n-1;
            else rightsmaller[i]=stack.peek()-1;
            stack.push(i);
        }
        int maxrec=0;
        for(int i=0;i<n;i++){
            maxrec=Math.max(maxrec,(rightsmaller[i]-leftsmaller[i]+1)*heights[i]);
        }
        return maxrec;
    }
}