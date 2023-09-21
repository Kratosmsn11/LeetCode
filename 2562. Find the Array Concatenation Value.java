class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concVal = 0;

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            concVal += start == end ? nums[start] : concat(nums[start], nums[end]);
            ++start;
            --end;
        }

        return concVal;
    }

    private long concat(long a, long b){
        return Long.parseLong(""+a+b);
    }
}
