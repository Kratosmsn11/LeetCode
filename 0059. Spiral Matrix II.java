class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int total = n*n;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        int count = 0;

        while(count<total){
            for(int i = startCol; i<=endCol && count<total; i++){
                res[startRow][i] = count+1;
                count++;
            }
            startRow++;

            for(int i = startRow; i<=endRow && count<total; i++){
                res[i][endCol] = count+1;
                count++;
            }
            endCol--;

            for(int i = endCol; i>=startCol && count<total; i--){
                res[endRow][i] = count+1;
                count++;
            }
            endRow--;

            for(int i = endRow; i>=startRow && count<total; i--){
                res[i][startCol] = count+1;
                count++;
            }
            startCol++;
        }

        return res;
    }
}
