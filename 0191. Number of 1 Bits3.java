public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return (n < 0) ? 32 - counter(~n) : counter(n);
    }

    private boolean checker(int a){
        return (a%2 == 1);
    }

    private int counter(int b){
        if(b == 0) return 0;
        return (checker(b) ? 1 : 0) + counter(b/2);
    }
}
