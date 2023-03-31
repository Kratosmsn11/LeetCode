class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        
        String[] strSplit1 = s.split("");
        Arrays.sort(strSplit1);

        String[] strSplit2 = t.split("");
        Arrays.sort(strSplit2);

        for(int i=0; i<s.length(); i++){
            if(!strSplit1[i].equals(strSplit2[i])) return false;
        }

        return true;
    }
}
