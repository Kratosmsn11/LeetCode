class Solution {
    public int[] twoSum(int[] nums, int target) {
        // one pass solution with Space & Time Complexity : O(n) respectively
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
