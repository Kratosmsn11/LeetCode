class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zeros = 0;
        while(j<nums.length){
            if(nums[j] == 0) zeros++;
            j++;

            if(zeros>k){
                if(nums[i] == 0) zeros--;
                i++;
            }
        }

        return j-i;
    }
}
