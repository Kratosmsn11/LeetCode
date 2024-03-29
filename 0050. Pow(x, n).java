class Solution {
    public double myPow(double x, int n) {
        // base case
        if(n == 0){
            return 1.0;
        }

        // if n is an even number
        if(n % 2 == 0){
            return myPow(x*x, n/2);
        }

        // if n is an odd number
        if(n % 2 == 1){
            return x * myPow(x, n - 1);
        }

        // if n is a negative number
        return 1/ myPow(x, -n);
    }
}
