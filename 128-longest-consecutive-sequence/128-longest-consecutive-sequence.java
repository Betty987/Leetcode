class Solution {
    public int longestConsecutive(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	for(int num:nums) {//add every element to the set
    		set.add(num);
    	}
    	
    	int longestlength=0;
    	for(int num:nums) {
    		if(!set.contains(num-1)){//if the
    			int currentNum=num;
    			int currentLength=1;
    			
    			while(set.contains(currentNum+1)) {
    				currentNum+=1;
    				currentLength+=1;
        			
        		}
    		longestlength=Math.max(currentLength, longestlength);
    		}
    		
    	}
        return longestlength;
    }
}
