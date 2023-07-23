class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0, res = 0;
        for(char c : s.toCharArray()){
            balance += (c == 'L') ? 1 : -1;
            res += balance == 0 ? 1 : 0;
        }
      
        return res;
    }
}
