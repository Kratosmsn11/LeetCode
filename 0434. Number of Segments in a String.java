class Solution {
    public int countSegments(String str) {

        String s = str.trim(); 
        if(s.equals("")){
            return 0;
        }

        int res = 1;
        for(int i = 1; i < s.length(); ++i){
            if(s.charAt(i-1) == ' ' && s.charAt(i) != ' '){
                res++;
            }
        }

        return res;
    }
}
