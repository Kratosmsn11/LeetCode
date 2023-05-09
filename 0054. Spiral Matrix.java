class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;
        int size = m * n;
        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();

        // O(m*n)
        while(count < size){
            // to traverse from left to right (in columns)
            for(int i = startCol; i <= endCol && count < size; i++){
                res.add(matrix[startRow][i]);
                count++;
            }
            startRow++;

            // to travese from top to bottom after reaching to the last column
            for(int i = startRow; i <= endRow && count < size; i++){
                res.add(matrix[i][endCol]);
                count++;
            }
            endCol--;

            //
            for(int i = endCol; i >= startCol && count < size; i--){
                res.add(matrix[endRow][i]);
                count++;
            }
            endRow--;

            for(int i = endRow; i >= startRow && count < size; i--){
                res.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }

        return res;
    }
}
