class Solution {
    public String reverseVowels(String s) {

        Set<Character> vowel = Set.of('a','e','i','o','u', 'A', 'E', 'I', 'O', 'U');
        char[] sChar = s.toCharArray();

        int i = 0, j = s.length()-1;
        while(i < j){
            while(i < s.length() && !vowel.contains(s.charAt(i))) i++;

            while(j >= 0 && !vowel.contains(s.charAt(j))) j--;

            System.out.println(" i : " + i + " j : " + j );

            if(i < j){
                char temp = sChar[i];
                sChar[i] = sChar[j];
                sChar[j] = temp;
                i++;
                j--;
            }
        }
        return new String(sChar);
    }
}
