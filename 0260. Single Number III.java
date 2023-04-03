class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!s.add(nums[i])){
                s.remove(nums[i]);
            }
        }

        int[] res = new int[2];
        int i =0;
        for(int a : s){
            res[i] = a;
            i++;
        }
        return res;
    }
}
