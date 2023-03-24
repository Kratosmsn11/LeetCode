class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] res = new int[nums.length];
        int leftSum = 0, rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                rightSum += nums[j];
            }
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
            rightSum = 0;
        }
        return res;
    }
}
