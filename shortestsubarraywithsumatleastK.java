class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long[] sum = new long[nums.length+1];
        for(int i=1;i<sum.length;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        ArrayDeque<Integer> deque = new ArrayDeque();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<sum.length;i++){
            while(!deque.isEmpty()&&sum[i]-sum[deque.peekFirst()]>=k){
                res = Math.min(res,i-deque.pollFirst());
            }

            //remove the last value in deque when the cur sum<last sum value
            while(!deque.isEmpty()&&sum[deque.peekLast()]>=sum[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return res<=nums.length? res:-1;
    }
}
