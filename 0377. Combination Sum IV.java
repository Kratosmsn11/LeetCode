class Solution {

    private HashMap<Integer, Integer> memo;
    public int combinationSum4(int[] nums, int target) {
        memo = new HashMap<>();
        return combination(nums, target);
    }

    private int combination(int[] nums, int remain){
        if(remain == 0){
            return 1;
        }

        if(memo.containsKey(remain)){
            return memo.get(remain);
        }

        int result = 0;
        for(int num: nums){
            if(remain - num >= 0){
                result += combination(nums, remain-num);
            }
            memo.put(remain, result);
        }
        return result;
    }
}
