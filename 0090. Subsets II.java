class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        res.add(new ArrayList<>());

        for(int num: nums){
            Set<List<Integer>> temp = new HashSet<>();

            for(List<Integer> s: res){
                temp.add(helper(s, num));
                temp.add(s);
            }
            res = temp;
        }

        List<List<Integer>> result = new ArrayList<>(res);
        return result;
    }

    private List<Integer> helper(List<Integer> s, int num){
        List<Integer> l = new ArrayList<>();
        l.addAll(s);
        l.add(num);

        return l;
    }
}
