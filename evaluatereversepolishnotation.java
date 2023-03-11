class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "-":
                    int val1=stack.pop();
                    int val2=stack.pop();
                    stack.push(val2-val1);
                    break;
                case "/":
                    val1=stack.pop();
                    val2=stack.pop();
                    stack.push(val2/val1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
