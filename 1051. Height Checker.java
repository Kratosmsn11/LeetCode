class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = heights[i];
        }

        Arrays.sort(heights);

        int res = 0;
        for(int j = 0; j < n; j++){
            if(temp[j] != heights[j]){
                res++;
            }
        }

        return res;
    }
}
