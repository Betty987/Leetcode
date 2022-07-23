class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        HashSet<Integer> intersection = new HashSet<>();
         for(int i:nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        int result[] = new int[intersection.size()];
        int index=0;
        for(int i:intersection){//for every element in the intersection,we add it to the result array.
            result[index++]=i;
        }
        return result;
    }
}