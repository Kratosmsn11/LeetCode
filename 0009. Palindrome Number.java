class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();

        String xs = Integer.toString(x);
        sb.append(xs);
        StringBuilder rev = sb.reverse();
        String s = rev.toString();

        if(s.equals(xs)) return true;
        else return false;
    }
}
