class Solution {
    public boolean judgeCircle(String moves) {
        int UD=0;
        int LR=0;
        for(int i=0;i<moves.length();i++){
            char currentmove= moves.charAt(i);
            if(currentmove=='U'){
                UD++;
            }
            else if(currentmove=='D')
                UD--;
            else if(currentmove=='L')
                LR++;
            else if(currentmove=='R')
                LR--;
        }
        return UD==0 && LR==0;
    }
}