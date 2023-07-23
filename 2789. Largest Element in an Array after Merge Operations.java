class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long res, curr;

        res = curr = nums[n-1];
        for(int i = n - 2; i >= 0; --i){
            if(curr >= nums[i]){
                curr += nums[i];
            }else{
                curr = nums[i];
            }
            res = Math.max(res, curr);
        }

        return res;
    }
}
