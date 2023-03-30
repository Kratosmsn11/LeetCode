class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i=0; i<s.length(); i++) res[indices[i]] = s.charAt(i);

        StringBuilder sb = new StringBuilder();
        sb.append(res);

        return sb.toString();
    }
}
