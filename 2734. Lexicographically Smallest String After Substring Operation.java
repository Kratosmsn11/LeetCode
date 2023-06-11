class Solution {
    public String smallestString(String s) {
        char[] ch = s.toCharArray();
        int i = 0, n = s.length();
        
        while(i<n && ch[i] == 'a'){
            i++;
        }

        if(i == n){
            ch[n-1] = 'z';
        }

        while(i < n && ch[i] != 'a'){
            --ch[i++];
        }

        return String.valueOf(ch);
    }
}
