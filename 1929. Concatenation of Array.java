class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];

        for(int i=0; i<result.length; i++){
            if(i<nums.length) result[i]=nums[i];
            else result[i]=nums[i-nums.length];
        }
        return result;
    }
}
