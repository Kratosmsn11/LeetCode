class Solution {
    public int sumOfSquares(int[] nums) {
        int sumOfSquares = 0;

        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(n % (i+1) == 0){
                sumOfSquares += nums[i] * nums[i];
            }
        }

        return sumOfSquares;
    }
}
