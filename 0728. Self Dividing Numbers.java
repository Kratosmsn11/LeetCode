class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(checker(i)) res.add(i);
        }

        return res;
    }

    private boolean checker(int n){
        for(char c: String.valueOf(n).toCharArray()){
            if(c == '0' || (n % (c - '0') > 0)) return false;
        }
        return true;
    }
}
