class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int a = 0, b = 0, n = s.length();
         for(int i = 0; i < n; i++){
            if(c[i] == ' ' || i == n-1){
                b = i == n-1 ? i : i-1;
                while(a<b){
                    char temp = c[a];
                    c[a] = c[b];
                    c[b] = temp;
                    a++;
                    b--;
                }
                a = i+1;
            }
        }

        return new String(c);
    }
}
