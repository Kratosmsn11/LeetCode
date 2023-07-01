class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int r = words.length, c = queries.length;

        int noOfVowels[] = new int[r];
        for(int i = 0; i < r; i++){
            noOfVowels[i] = helper(words[i]);
        }

        for(int i = 1; i < r; i++){
            noOfVowels[i] += noOfVowels[i-1];
        }

        int res[] = new int[c];
        for(int j = 0; j < c; j++){
            if(queries[j][0] == 0){
                res[j] = noOfVowels[queries[j][1]];
            }else{
                res[j] = noOfVowels[queries[j][1]] - noOfVowels[queries[j][0] - 1];
            }
        }

        return res;
    }

    private int helper(String s){
        String key = "aeiou";

        return key.contains(s.charAt(0)+"") && key.contains(s.charAt(s.length()-1)+"") ? 1 : 0;
    }
}
