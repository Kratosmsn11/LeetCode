class Solution {
    public int largestVariance(String s) {
        int count1 = 0, count2 = 0, res = 0;

        HashSet<Character> distChars = new HashSet<>();
        for(char c: s.toCharArray()){
            distChars.add(c);
        }

        for(int i = 0; i < 2; i++){
            for(char l1 : distChars){
                for(char l2 : distChars){
                    if(l1 == l2){
                        continue;
                    }

                    count1 = 0;
                    count2 = 0;
                    for(char l: s.toCharArray()){
                        if(l == l1){
                            count1++;
                        }else if(l == l2){
                            count2++;
                        }
                        if(count1 < count2){
                            count1 = 0;
                            count2 = 0;
                        }else if(count1 > 0 && count2 > 0){
                            res = Math.max(res, count1-count2);
                        }
                    }
                }
            }

            s = new StringBuilder(s).reverse().toString();
        }

        return res;
    }
}
