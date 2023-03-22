class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
    
      long low = 1, high = x, res = 0;
      while(low<=high){
        long mid = low + (high-low)/2;
        if(x == (mid*mid)) return (int)mid;
        else if(x< (mid*mid)) high = mid - 1;
        else{
            low = mid + 1;
            res = mid;
        }
      }
      return (int)res;
    }
}
