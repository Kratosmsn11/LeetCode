class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1], res;
        for(int i = 2; i<cost.length; i++){
            res = Math.min(a,b) + cost[i];
            a = b;
            b = res;
        }

        return Math.min(a,b);
    }
}
