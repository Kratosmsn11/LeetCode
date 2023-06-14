class Solution {
    public int longestSubarray(int[] nums) {
        int zeros = 0, longestWindow = 0;

        int start = 0;
        for(int i = 0; i < nums.length; i++){
            zeros += (nums[i] == 0 ? 1 : 0);

            while(zeros > 1){
                zeros -= (nums[start] == 0 ? 1 : 0);
                start++;
            }

            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }
}
