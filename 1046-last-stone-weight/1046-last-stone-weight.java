class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap= new PriorityQueue<>();
        for(int stone:stones){
            maxheap.add(-stone);//by default java creates min heap so we put - to makee it max heap
        }
        while(maxheap.size()>1){
            int stone1=-maxheap.remove();
            int stone2=-maxheap.remove();
            if(stone1!=stone2)
                maxheap.add(-(stone1-stone2));
            
        }
        return maxheap.isEmpty()?0:-maxheap.remove();
    }
}