class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int result = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num: freq){
            while(num > 0 && seen.contains(num)){
                num--;
                result++;
            }
            seen.add(num);
        }

        return result;
    }
}
