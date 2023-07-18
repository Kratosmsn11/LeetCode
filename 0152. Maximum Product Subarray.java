class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubarray = nums[0], maxSubarray = nums[0];

        for(int i = 1; i < n; i++){
            int num = nums[i];

            currSubarray = Math.max(num, currSubarray + num);
            maxSubarray = Math.max(maxSubarray, currSubarray);
        }

        return maxSubarray;
    }   
}
