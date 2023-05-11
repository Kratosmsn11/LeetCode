class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\\s");
        String[] res = new String[words.length];

        for(String t: words){
            int temp = Character.getNumericValue(t.charAt(t.length()-1))-1;
            String temp2 = t.substring(0, t.length()-1);
            System.out.println(temp2);
            res[temp] = temp2;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res.length; i++) {
            sb.append(res[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
