class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int t = nums[i];
            while(t > 0){
                st.add(t%10);
                t /= 10;
            }

            while(!st.empty()) al.add(st.pop());
        }

        int[] res = new int[al.size()];
        for(int i = 0; i < al.size(); i++) res[i] = al.get(i);

        return res;
    }
}
