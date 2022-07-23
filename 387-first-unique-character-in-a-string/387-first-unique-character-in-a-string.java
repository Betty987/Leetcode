class Solution {
    public int firstUniqChar(String s) {
        int min = Integer.MAX_VALUE;
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
        if(!map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),i);
        }else{
            map.put(s.charAt(i),-1);
        }
    }
    for(char c:map.keySet()){
        if(map.get(c)>-1 && map.get(c)<min){
            min=map.get(c);
        }
    }
        return min==Integer.MAX_VALUE?-1:min;
    }
}