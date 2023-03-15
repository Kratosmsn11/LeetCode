import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        String numString = "";
        for(int i=0; i<num.length; i++) numString += num[i];

        BigInteger s1 = new BigInteger(numString);
        BigInteger res = s1.add(BigInteger.valueOf(k));
        String s = res.toString();

        for(int i=0; i<s.length(); i++) result.add(s.charAt(i) - '0');

        return result;
    }
}
