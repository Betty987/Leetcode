class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] e:edges){
            int x = e[0],y = e[1];
            graph.computeIfAbsent(x,val -> new ArrayList<Integer>()).add(y);
            graph.computeIfAbsent(y,val -> new ArrayList<Integer>()).add(x);
        }

        boolean[] visited = new boolean[n];
        visited[source]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
         while (!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == destination) {
                return true; 
            }


            for (int nextNode : graph.get(currNode)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
        
        return false;
    }
}
