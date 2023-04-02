class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!s.add(nums[i])) return true;

            if(i >= k) s.remove(nums[i-k]);
        }
        return false;
    }
}
