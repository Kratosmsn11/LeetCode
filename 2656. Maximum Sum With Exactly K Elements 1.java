class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        // arithmetic series
        return k * (max + (max + k - 1))/2;
    }
}
