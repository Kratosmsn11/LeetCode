class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        Arrays.fill(colors, -1);

        for(int i = 0; i < graph.length; i++){
            if(colors[i] == -1){
                if(!dfs(i, graph, colors, 1)) return false;
            }
        }

        return true;
    }

    private boolean dfs(int i, int[][] graph, int[] colors, int col){
        if(colors[i] == 1 - col) return false;

        if(colors[i] == col) return true;

        colors[i] = col;

        for(int g : graph[i]){
            if(!dfs(g, graph, colors, 1 - col)) return false;
        }

        return true;
    }
}
