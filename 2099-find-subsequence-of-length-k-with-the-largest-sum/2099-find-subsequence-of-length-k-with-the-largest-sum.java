class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minheap=new PriorityQueue<int[]>((a,b)->(a[0]-b[0]));
        for(int i=0;i<nums.length;i++){
            minheap.offer(new int[]{nums[i],i});
            if(minheap.size()>k)
                minheap.poll();
        }
        
        Set<Integer> index=new HashSet();
        while(!minheap.isEmpty()){
            int top[] =minheap.poll();
            index.add(top[1]);
        }
        
        int[] ans = new int[k];
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(index.contains(i)){
                ans[p]=nums[i];
                p++;
            }
        }
        return ans;
    }
}