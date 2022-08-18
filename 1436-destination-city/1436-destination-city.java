class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String>CityFirst=new HashSet();
        HashSet<String>CitySecond=new HashSet();
        for(int i=0;i<paths.size();i++){
           String Stringfirst=paths.get(i).get(0);
           String Stringsecond=paths.get(i).get(1);
            CityFirst.add(Stringfirst);
            CitySecond.add(Stringsecond);
        }
        for(String a:CitySecond){
            if(!CityFirst.contains(a)){
                return a;
            }
        }
        return " ";
    }
}