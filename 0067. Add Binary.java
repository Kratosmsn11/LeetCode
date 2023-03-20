class Solution {
    public String addBinary(String a, String b) {
        if(b.length() > a.length()) addBinary(b,a);

        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        sba = sba.reverse(); // 11 
        sbb = sbb.reverse(); // 1

        while(sba.length() != sbb.length()){
            sbb.append('0');
        }

        a = sba.toString();
        b = sbb.toString();
        
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            int sum = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
            result.append(sum % 2);
            carry = sum/2;
        }

        if(carry != 0) result.append('1');

        result = result.reverse();
        return result.toString();
    }
}
