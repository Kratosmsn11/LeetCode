class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i<=(n-2); i++){
            String s = "";
            int num = n;
            while(num>0){
                s += Integer.toString(num%i);
                num /= i;
            }
            if(!isPalindrome(s)) return false;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
