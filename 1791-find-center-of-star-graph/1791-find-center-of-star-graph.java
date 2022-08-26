class Solution {
    public int findCenter(int[][] edges) {
        //space=O(n)
        //time=O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] edge:edges){
            map.put(edge[0],map.getOrDefault(edge[0],0)+1);
            map.put(edge[1],map.getOrDefault(edge[1],0)+1); 
        }
        for(int key:map.keySet()){
            if(map.get(key)==edges.length)
                return key;
        }
        return 0;
    }
}