class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);

        return res;
    }

    private void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> res){
        // once the current is full add to result
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int num : nums){
            if(!curr.contains(num)){
                curr.add(num);
                backtrack(nums, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
