class Solution {
    public int addDigits(int num) {
        int res = 0;
        while(num>0){
            res += num % 10;
            num /= 10;

            if((num == 0) && (res > 9)){
                num = res;
                res = 0;
            }
        }
        return res;
    }
}
