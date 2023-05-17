class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> c = new ArrayList<>();
        for(int i = 0; i < allowed.length(); i++) c.add(allowed.charAt(i));

        int res = 0;
        for(int i = 0; i < words.length; i++){
            boolean check = true;
            for(int j = 0; j < words[i].length(); j++){
                String s = words[i];
                if(!c.contains(s.charAt(j))) check = false;
            }
            if(check) res++;
        }

        return res;
    }
}
