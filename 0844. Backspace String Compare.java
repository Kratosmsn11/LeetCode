class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = stringWithout(s);
        t = stringWithout(t);

        return s.equals(t);
    }

    private String stringWithout(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#') {
                if(sb.length() != 0) sb.deleteCharAt(sb.length()-1);
            }
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
