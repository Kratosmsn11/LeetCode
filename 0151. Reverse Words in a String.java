class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            if(!words[i].isEmpty()) {
                sb.insert(0, words[i]);
                if(i < words.length-1) sb.insert(0, " ");
            }
        }
        return sb.toString();
    }
}
