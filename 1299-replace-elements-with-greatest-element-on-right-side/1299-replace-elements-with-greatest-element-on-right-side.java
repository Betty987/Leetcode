class Solution {
    public int[] replaceElements(int[] arr) {
       int greatest=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];//why we store it in temp is because it is the former value we might lose it
            
            arr[i]=greatest;
            if(temp>greatest)
                greatest=temp;
        }
             return arr;
        }
        
    }
