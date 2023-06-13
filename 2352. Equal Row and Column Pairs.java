class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int a = 0;
                
                for(int k = 0; k < n; k++){
                    if(grid[i][k] == grid[k][j]){
                        a++;
                    }
                }

                if(a == n) {
                    res++;
                }
            }
        }

        return res;
    }
}
