class Solution {
    public boolean isUgly(int n) {
        if(n == 0) return false;
        if(n == 1) return true;

        for(int i: new int[] {2, 3, 5}){
            if(n % i == 0){
                if(isUgly(n/i) == true) return true;
            }
        }

        return false;
    }
}
