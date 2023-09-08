/*

    Idea: Rather than looking the triangle as a growing tree from the middle
    it can be looked something like this.

    Ex: numRows = 5
    [1]
    [1, 1]
    [1, 2, 1]
    [1, 3, 3, 1]
    [1, 4, 6, 4, 1]

    using curr & prev:
    what we do here is that everytime we add 0 to curr's position 0 and add all the previous numbers
    according to the indexes
    Format used: curr + prev
    Ex: numRows = 5
    [0] + [1]
    [0, 1] + [1]
    [0, 1, 2, 1] + [1, 1]
    [0, 1, 3, 3, 1] + [1, 2, 1]
    [1, 4, 6, 4, 1] (we end up with this result)
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        Stack<List<Integer>> res = new Stack<>();
        List<Integer> prev = new ArrayList<>();

        prev.add(1);
        res.add(prev);

        while(res.size() < numRows){
            prev = res.peek();

            List<Integer> curr = new ArrayList<>();
            curr.add(0);
            curr.addAll(prev);

            for(int i = 0; i < prev.size(); ++i){
                curr.set(i, prev.get(i) + curr.get(i));
            }

            res.add(curr);
        }

        return res;
    }
}
