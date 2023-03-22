class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        else if(x <= 3) return 1;

        long i = 2;
        while(true){
            if((i*i <= x) && (x < (i+1)*(i+1))) return (int)i;
            else if(x == (i+1)*(i+1)) return (int)i+1;
            i++;
        }
    }
}
