class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1section = version1.split("\\."),v2section=version2.split("\\.");
        int i=0,j=0;
        int m=v1section.length,n=v2section.length;
        while(i<m||j<n){
             int v1=i<m?Integer.parseInt(v1section[i]):0;
             int v2=j<n?Integer.parseInt(v2section[j]):0;
             if(v1!=v2) return v1<v2?-1:1;
             if(i<m) i++;
             if(j<n) j++;
            
        }
      
        return 0;
    }
}