class Solution {
    public int pivotInteger(int n) {
        int sum = (n*(n+1))/2;
        int leftSum = 1;

        if(n == 1) return 1;

        for(int i = 2; i <= n; i++){
            System.out.println("Left Sum : " + leftSum + " Right Sum : " + (sum - leftSum - i));
            if(leftSum == sum - leftSum - i) return i;
            leftSum += i;
        }

        return -1;
    }
}
