class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rev = sb.reverse();
        
        s = rev.toString();
        int[] arr = new int[2];
        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '1'){
                if(i%2 == 0) arr[0] += 1;
                if(i%2 == 1) arr[1] += 1;
            }
        }        
        return arr;
    }
}
