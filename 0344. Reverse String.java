// two pointer solution
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while(i < j){
            char valueHolder = s[i];
            s[i] = s[j];
            s[j] = valueHolder;
            ++i;
            --j;
        }
    }
}
