class Solution {
    public boolean isPerfectSquare(int num) {
      if(num == 0) return true;
    
      long low = 1, high = num, res = 0;
      while(low<=high){
        long mid = low + (high-low)/2;
        if(num == (mid*mid)) return true;
        else if(num < (mid*mid)) high = mid - 1;
        else{
            low = mid + 1;
            res = mid;
        }
      }
      return false;
    }
}
