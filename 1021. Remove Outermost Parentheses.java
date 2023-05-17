class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(' && count == 0) count++;
            else if(s.charAt(i)=='(' && count >= 1){
                res += s.charAt(i);
                count++;
            }else if(s.charAt(i)==')' && count > 1){
                res += s.charAt(i);
                count--;
            }else if(s.charAt(i)==')' && count == 1) count--;
        }

        return res;
    }
}
