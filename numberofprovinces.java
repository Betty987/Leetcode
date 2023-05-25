class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;
        int n = isConnected.length;
        //visited array
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i,n);
                provinces++;
            }
        }
        return provinces;
    }

    void dfs(int[][] isConnected,boolean[] visited,int x,int n){
        visited[x] = true;
        for(int i=0;i<n;i++){

            //if it is connected and not visited
            if(isConnected[x][i]==1&&!visited[i]){
                dfs(isConnected,visited,i,n);
            }
        }
    }
}
