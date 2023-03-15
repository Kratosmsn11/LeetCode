class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = 201;
        String minLen = " ";
        for(int i=0; i < strs.length; i++){
            if(strs[i].length() < min) {
                min = strs[i].length();
                minLen = strs[i];
            }
        }
        
        String res = "";
        for(int i=0; i< min; i++){
            char temp = minLen.charAt(i);
            for(int j= 0; j<strs.length; j++){
                if(temp == strs[j].charAt(i)){
                    continue;
                }else{
                    return res;
                }
            }
            res += temp;
        }
        return res;
    }
}
