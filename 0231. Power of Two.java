class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;

        while(n>1){
            if(n%2 != 0) return false;
            else n /= 2;
        }
        if(n == 1) return true;
        
        return false;
    }
}
