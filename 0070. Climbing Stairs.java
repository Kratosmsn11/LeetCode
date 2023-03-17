class Solution {
    public int climbStairs(int n) {
        int result = 0; // storing for n = 1
        int pres = 2;
        int ppres = 1;

        if ( n == 1 ) return 1;
        if ( n == 2 ) return 2;

        for(int i = 2; i < n; i++){
            result = pres + ppres;
            ppres = pres;
            pres = result;
        }

        return result;
    }
}
