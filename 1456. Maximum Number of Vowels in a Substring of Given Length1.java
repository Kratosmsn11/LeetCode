class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u');

        int count = 0;
        for(int i = 0; i < k; i++) count += vowels.contains(s.charAt(i)) ? 1 : 0;
        int res = count;

        for(int i = k; i < s.length(); i++){
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i-k)) ? 1 : 0;
            res = Math.max(count, res); 
        }

        return res;
    }
}
