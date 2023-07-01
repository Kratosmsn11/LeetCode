class Solution {
    int res = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        backtrack(cookies, 0, k, new int[k]);
        return res;
    }

    private void backtrack(int[] cookies, int start, int k, int[] temp){

        if(start == cookies.length){
            int max = 0;
            for(int num : temp){
                max = Math.max(max, num);
            }
            res = Math.min(res, max);
            return;
        }

        for(int i = 0; i < k; i++){
            temp[i] += cookies[start];
            backtrack(cookies, start + 1, k, temp);
            temp[i] -= cookies[start];
        }
    }
}
