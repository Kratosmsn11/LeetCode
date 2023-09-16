class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            // count of c in ransomNote > count of c in ransomNote => false
            if(getCount(ransomNote, c) > getCount(magazine, c)){
                return false;
            }
        }

        return true;
    }

    private int getCount(String s, char goal){
        return (int) s.chars().filter(c -> c == goal).count();
    }
}
