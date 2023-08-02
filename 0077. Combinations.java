class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), res);

        return res;
    }

    private void backtrack(int num, int n, int k, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }

        int need = k - curr.size();
        int remain = n - num + 1;
        int available = remain - need;

        for(int i = num; i <= num + available; i++){
            curr.add(i);
            backtrack(i + 1, n, k, curr, res);
            curr.remove(curr.size() - 1);
        }

        return;
    }
}
