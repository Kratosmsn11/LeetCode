// using String Builder
class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder().append(s);
        sb.reverse();

        for(int i = 0; i < s.length; ++i){
            s[i] = sb.charAt(i);
        }
    }
}
