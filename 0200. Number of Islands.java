class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int res = 0;
    
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid, i, j);
                }
            }
        }

        return res;
    }

    public void dfs(char[][] grid, int i, int j){
        int r = grid.length;
        int c = grid[0].length;

        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);

        return;
    }
}
