import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        for(int i=0; i<digits.length; i++) s += digits[i];
        
        BigInteger b = new BigInteger("1");
        BigInteger sb = new BigInteger(s);
        BigInteger res = b.add(sb);

        s = res.toString();
        
        int[] result = new int[s.length()];
        for(int i=0; i<s.length(); i++) result[i] = s.charAt(i) - '0';
        return result;
    }
}
