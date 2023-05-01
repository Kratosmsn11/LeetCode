class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int res = 0;
        while(k > 0){
            res += max;
            max += 1;
            k--;
        }
        return res;
    }
}
