class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(String str : sentences){
            int max = 1;
            for(char ch: str.toCharArray()){
                if(ch == ' '){
                    max++;
                }
            }

            res = Math.max(res, max);
        }
        return res;
    }
}
