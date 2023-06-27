class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, prod = 1;

        while(n > 0){
            int digit = n%10;
            prod *= digit;
            sum += digit;
            n = n/10;
        }

        return prod-sum;
    }
};
