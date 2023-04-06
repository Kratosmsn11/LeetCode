class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            res[i] = counter(i);
        } 
        return res;
    }

    private boolean checker(int a){
        return (a%2 == 1);
    }

    private int counter(int b){
        if(b == 0) return 0;
        return (checker(b) ? 1 : 0) + counter(b/2);
    }
}
