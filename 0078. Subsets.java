class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for(int num: nums){
            List<List<Integer>> temp = new ArrayList<>();
            
            for(List<Integer> s : res){
                temp.add(helper(s, num));
                temp.add(s);
            }
            res = temp;
        }

        return res;
    }

    private static List<Integer> helper(List<Integer> s, int num){
        List<Integer> newList = new ArrayList<>();
        newList.addAll(s);
        newList.add(num);
        return newList;
    }
}
