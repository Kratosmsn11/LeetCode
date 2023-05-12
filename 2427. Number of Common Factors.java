class Solution {
    public int commonFactors(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int res = 0;

        for(int i = 1; i<=min; i++){
            if(max%i == 0 && min%i == 0) res++
        }

        return res;
    }
}
