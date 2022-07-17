class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] result=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){//popping if temp in the stack is smaller
           while(!stack.isEmpty()&&temperatures[stack.peek()]<=temperatures[i]){
               stack.pop();
               
           }
            if(!stack.isEmpty()){//if we found the next warmer temperature
                result[i]=stack.peek()-i;
            }
            stack.push(i);//if the stack is empty we add the index
        }
        return result;
    }
}