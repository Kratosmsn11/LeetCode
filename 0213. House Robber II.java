class Solution {
    public int rob(int[] nums) {
        int option1 = nums[0] + robber(nums, 2, nums.length-2); // if we steal from house 1.
        int option2 = robber(nums, 1, nums.length-1); // if we dont't steal from house 1.

        return Math.max(option1,option2);
    }

    private int robber(int[] nums, int start, int end){
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i<=end; i++){
            int temp = Math.max(prev1, prev2+nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}
