class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for(int i = nums.length-1; i >= 0; i--){
            int t = nums[i];
            while(t > 0){
                st.push(t%10);
                t /= 10;
            }
        }

        int[] res = new int[st.size()];
        int j = 0;
        while(!st.empty()){ 
            res[j++] = st.pop(); 
        }

        return res;
    }
}
