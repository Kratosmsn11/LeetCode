class Solution {
    public int climbStairs(int n) {
        if ( n == 1 || n == 2) return n;

        int result = 0;
        int pres = 2;
        int ppres = 1;

        for(int i = 2; i < n; i++){
            result = pres + ppres;
            ppres = pres;
            pres = result;
        }

        return result;
    }
}
