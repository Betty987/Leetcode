class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap();
       List<Integer> res = new ArrayList<>();
       int[] array = new int[2];
       for(int num:nums){
           if(!map.containsKey(num)){
               map.put(num,1);
           }
           else
                map.put(num,map.get(num)+1);
       } 
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()==1){
               res.add(entry.getKey());
           }
       }
       for(int i=0;i<res.size();i++){
           array[i] = res.get(i);
                  }
       return array;
    }
}
