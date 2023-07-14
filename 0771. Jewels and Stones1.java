class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set<Character> s = new HashSet<>();
        for(char c: jewels.toCharArray()){
            s.add(c);
        }

        for(char c: stones.toCharArray()){
            if(s.contains(c)){
                res++;
            }
        }
        return res;
    }
}
