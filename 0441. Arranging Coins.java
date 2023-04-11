class Solution {
    public int arrangeCoins(long n) {
        long i = 1, j = n+1;

        while(i+1!=j){
            System.out.println(i + " " + j);
            long mid = i + (j-i)/2;
            long numCoins = (mid+1)*mid/2;

            if(numCoins > n) j = mid;
            else i = mid;
        }
        return (int)i;
    }
}
