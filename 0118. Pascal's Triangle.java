class Solution {
    public List<List<Integer>> generate(int numRows) {

        Stack<List<Integer>> res = new Stack<List<Integer>>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);

        while(res.size() < numRows){
            prev = res.peek();
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(0);
            curr.addAll(prev);
            for(int i = 0; i < prev.size(); i++){
                curr.set(i, prev.get(i)+curr.get(i));
            }
            res.add(curr);
        }

        return res;
    }
}
