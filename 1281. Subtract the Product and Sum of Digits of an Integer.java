class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0, i = 0;

        while(n>0){
            prod *= n%10;
            sum += n%10;
            n = n/10;
            i++;
        }
        
        return prod-sum;
    }
}
