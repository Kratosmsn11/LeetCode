class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for(int a: nums) sum += a;
        for(int a = 0; a < nums.length; a++){
            if(leftSum == (sum-(leftSum+nums[a]))) return a;
            leftSum += nums[a];
        }
        return -1;
    }
}
