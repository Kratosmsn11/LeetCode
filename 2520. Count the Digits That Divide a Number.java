class Solution {
    public int countDigits(int num) {        
        int count = 0, t = num;

        while(t > 0){
            int temp = t % 10;
            t /= 10;
            if(num % temp == 0) count++;
        }

        return count;
    }
}
