class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        int i = s.length()-1;
        while(i >= 0){
            int temp = 96;
            if(s.charAt(i) == '#'){
                i -= 2;
                temp += Integer.parseInt(String.valueOf(s.charAt(i)))*10 + Integer.parseInt(String.valueOf(s.charAt(i+1)));
                sb.append((char)temp);
            }else{
                temp += Integer.parseInt(String.valueOf(s.charAt(i)));
                sb.append((char)temp);
            }
            i--;
        }
        
        sb = sb.reverse();
        return sb.toString();
    }
}
