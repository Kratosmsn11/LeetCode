class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        Stack<int []> s = new Stack<>();

        for(int num: nums){
            if(!s.isEmpty() && s.peek()[1] == num - 1){
                s.peek()[1] = num;
            }else{
                s.push(new int[] {num, num});
            }
        }

        Stack<String> ranges = new Stack<>();
        for(int[] range: s){
            ranges.add(
                range[0] == range[1]?
                String.valueOf(range[0]):
                range[0] + "->" + range[1]
            );
        }

        return ranges;
