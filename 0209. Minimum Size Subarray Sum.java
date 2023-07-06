class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sumOfCurrWindow = 0, res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++){
            sumOfCurrWindow += nums[right];

            while(sumOfCurrWindow >= target){
                res = Math.min(res, right - left + 1);
                sumOfCurrWindow -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
