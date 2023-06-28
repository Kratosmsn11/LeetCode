class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res = 0;

        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[0].length; j++){
                if(grid1[i][j] == 0 && grid2[i][j] == 1){
                    dfs(grid2, i, j);
                }
            }
        }

        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[0].length; j++){
                if(grid2[i][j] == 1){
                    dfs(grid2, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return;
        }

        grid[i][j] = 0;

        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}
