class Solution {
    public int[] sortArray(int[] nums) {
        nums=mergesort(nums);
        return nums;
	}
    public int[] mergesort(int [] nums){
        if(nums.length==1) return nums;
        int mid=nums.length/2;
        int[] firsthalf=mergesort(Arrays.copyOfRange(nums,0,mid));
        int[] secondhalf=mergesort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(firsthalf,secondhalf);
    }
    public int[] merge(int[] first,int[] second){
        int [] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j < second.length){
            if(first[i]<second[j])
                mix[k++]=first[i++];
            else
                mix[k++]=second[j++];
            
        }
        while(i<first.length){
            mix[k++]=first[i++];
        }
        while(j<second.length){
            mix[k++]=second[j++];
        }
        
        return mix;
    }
	
	
	}
    
