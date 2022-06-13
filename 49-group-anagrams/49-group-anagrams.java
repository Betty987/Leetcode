class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chararray = str.toCharArray();
            Arrays.sort(chararray);
            String sortedstr = String.valueOf(chararray);
            if(!map.containsKey(sortedstr))
                 map.put(sortedstr,new ArrayList<String>());
        
        map.get(sortedstr).add(str);
        }
        return new ArrayList(map.values());
        
        
    }
}