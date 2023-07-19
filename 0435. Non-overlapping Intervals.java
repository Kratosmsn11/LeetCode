class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // sorting the intervals based on the end value of each interval
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));

        int n = intervals.length, checker = Integer.MIN_VALUE, res = 0;
        for(int i = 0; i < n; i++){
            // if the checker is less than the start of the interval set the end to the checker, otherwise that set needs to be removed that's why we increment res.
            if(checker <= intervals[i][0]){
                checker = intervals[i][1];
            }else{
                res++;
            }
        }
        return res;
    }
}
