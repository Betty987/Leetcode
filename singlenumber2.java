class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            int key=entry.getKey();
            if(value==1)
                return key;
        }
        return -1;
    }
}
