class SmallestInfiniteSet {
    PriorityQueue<Integer> minheap;
    HashSet<Integer>set;
    public SmallestInfiniteSet() {
        minheap=new PriorityQueue<>(1000);
        set=new HashSet(1000);
        for(int i=1;i<=1000;i++){
            minheap.add(i);
            set.add(i);
        }
        
    }
    
    public int popSmallest() {
        int x=minheap.poll();
        set.remove(x);
       
            
            return x;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){
             minheap.add(num);
             set.add(num);
        }
       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */