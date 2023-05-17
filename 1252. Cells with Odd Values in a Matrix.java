class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int res = 0;
        int[][] matrix = new int[m][n];

        for(int i = 0; i < indices.length; i++){

            int row = indices[i][0];
            int col = indices[i][1];

            for(int j = 0; j < n; j++){
                matrix[row][j] += 1;
            }

            for(int j = 0; j < m; j++){
                matrix[j][col] += 1;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] % 2 != 0) res++;
            }
        }

        return res;
    }
}
