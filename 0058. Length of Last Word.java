class Solution {
    public int lengthOfLastWord(String s) {
        int start = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                start = i;
                break;
            }
        }
      
        int count = 0;
        for(int i = start; i >= 0; i--){
            if(s.charAt(i) != ' ') count ++;
            else break;
        }
        return count;
    }
}
