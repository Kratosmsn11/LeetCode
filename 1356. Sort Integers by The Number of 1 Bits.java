class Solution {
    public int[] sortByBits(int[] arr) {

        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] += Integer.bitCount(arr[i])*10001;
        }

        Arrays.sort(arr);
        for(int j = 0; j < n; j++){
            arr[j] = arr[j] % 10001;
        }

        return arr;
    }
}
