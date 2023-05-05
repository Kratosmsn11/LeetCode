class Solution {
    public int maxVowels(String s, int k) {
        List vowels = Arrays.asList(new Character[]{'a','e','i','o','u'});
        System.out.println(vowels);
        int max = 0;
        for(int i = 0; i <= s.length()-k; i++){
            int j = 0, temp = 0;
            System.out.println(" i :" + i);
            while(j < k){
                System.out.println(vowels.contains(s.charAt(j)));
                if(vowels.contains(s.charAt(i+j))) temp++;
                if(temp > max) max = temp;
                j++;
            }
        }

        return max;
    }
}
