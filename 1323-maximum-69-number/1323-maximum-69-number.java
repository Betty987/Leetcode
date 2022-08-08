class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        int c=0;
        String res = "";
       
        for(char ch:str.toCharArray()){
          if(ch-'0'==6 && c==0){//if it is a 6 we append a 9
              res+='9';
              c++;
              continue;//this continue statement is very important.
          }
          res+=ch;//else if it is 9 we append itself
            
        }
        
        return Integer.parseInt(res);
      }
    }
