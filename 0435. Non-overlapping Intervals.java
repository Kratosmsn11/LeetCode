class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        // sorting the intervals according to their end.
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int n = intervals.length, checker = Integer.MIN_VALUE, res = 0;
        for(int i = 0; i < n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            // checking if the end of the previous is greater than the start of the 2nd.
            if(checker <= start){
                checker = end;
            }else{
                res++;
            }
        }

        return res;
    }
}
