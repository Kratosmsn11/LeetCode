class Solution {
    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        for(int i = 0; i < r; i++){
            if(grid[i][0] == 1){
                dfs(grid, i, 0);
            }

            if(grid[i][c-1] == 1){
                dfs(grid, i, c-1);
            }
        }

        for(int j = 0; j < c; j++){
            if(grid[0][j] == 1 ){
                dfs(grid, 0, j);
            }

            if(grid[r-1][j] == 1){
                dfs(grid, r-1, j);
            }
        }

        int res = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    res++;
                }
            }
        }

        return res;
    }

    public void dfs(int [][] grid, int i, int j){
        int r = grid.length;
        int c = grid[0].length;

        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != 1){
            return;
        }
        
        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);

        return;        
    }
}
