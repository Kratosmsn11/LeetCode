class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, res = 0;

        for(int i = 0; i<n; i++){
            int currSum = 0;
            for(int j = i; j<n; j++){
                currSum += arr[j];
                res += (j-i+1)%2 == 1 ? currSum : 0;
            }
        }
        return res;
    }
}
