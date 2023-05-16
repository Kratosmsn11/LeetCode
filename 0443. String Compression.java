class Solution {
    public int compress(char[] chars) {
        int index = 0, count = 1;
        String s = "";
        if(chars.length == 0) return 1;

        for(int i = 1; i < chars.length; i++){
            if(chars[i] == chars[index]) count++;
            else {
                if(count == 1) s += chars[index];
                else s = s + chars[index] + count;
                index = i;
                count = 1;
            }
            
        }

        if(count == 1) s += chars[index];
        else s = s + chars[index] + count;

        for(int i=0; i < s.length(); i++) chars[i] = s.charAt(i);

        return s.length();
    }
}
