class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a = 0; a*a <=c; a++){
            int b = c - (int)(a*a);
            if(search(0,b,b)) return true;           
        }
        return false;
    }

    private boolean search(long s, long e, int n){
        if(s>e) return false;
        long mid = s + (e-s)/2;
        if(mid*mid == n) return true;
        else if(mid*mid>n) return search(s,mid-1, n);
        return search(mid+1,e,n);
    }
}
