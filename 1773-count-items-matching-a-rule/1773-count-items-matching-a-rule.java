class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int searchindex=0;
        if(ruleKey.equals("color"))
            searchindex=1;
        else if(ruleKey.equals("name"))
            searchindex=2;
        for(int i=0;i<items.size();i++){
            if((items.get(i)).get(searchindex).equals(ruleValue))
                count++;
        }
        return count;
    }
}