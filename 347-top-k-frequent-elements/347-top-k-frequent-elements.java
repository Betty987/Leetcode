class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       List<Integer> buckets[] = new List[nums.length+1]; 
        Map<Integer,Integer> frequencymap = new HashMap<>();
        for(int n:nums){//populating hashmap
            frequencymap.put(n,frequencymap.getOrDefault(n,0)+1);
        }
        for(int key:frequencymap.keySet()){
            int frequency=frequencymap.get(key);
            if(buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int [] result = new int[k];
        int counter=0;
        for(int i=buckets.length-1;i>=0&counter<k;i--){
            if(buckets[i]!=null){
                for(Integer integer:buckets[i]){
                    result[counter++]=integer;
                }
            }
        }
        return result;
    }
}