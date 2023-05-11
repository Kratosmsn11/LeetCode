class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digitSum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int temp = nums[i];
            while(temp > 0){
                int t = temp % 10;
                digitSum += t;
                temp /= 10;
            }
        }

        return Math.abs(digitSum - sum);
    }
}
