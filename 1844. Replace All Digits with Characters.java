class Solution {
    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 1; i < s.length(); i += 2){
            res.append(s.charAt(i-1));
            res.append((char) (s.charAt(i-1) + s.charAt(i) - '0'));
        }

        if(s.length() % 2 != 0) res.append(s.charAt(s.length()-1));

        return res.toString();
    }
}
