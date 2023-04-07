class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> res = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            char[] c = words[i].toCharArray();
            Arrays.sort(c);
            String curr = new String(c);
            if(!prev.equals(curr)) {
                res.add(words[i]);
                prev = curr;
            }
        }


        return res;
    }
}
