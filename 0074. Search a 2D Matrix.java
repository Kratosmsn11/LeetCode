class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = (matrix.length*matrix[0].length)-1;
        int cols = matrix[0].length;

        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(matrix[mid/cols][mid%cols] == target) return true;
            else if(matrix[mid/cols][mid%cols] < target) low = mid+1;
            else high = mid-1;
        }

        return false;
    }
}
