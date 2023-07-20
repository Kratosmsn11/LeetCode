class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int num : asteroids){
            boolean checker = true;
            while(!st.empty() && (st.peek() > 0 && num < 0)){
                
                if(Math.abs(st.peek()) < Math.abs(num)){
                    st.pop();
                    continue;
                }else if(Math.abs(st.peek()) == Math.abs(num)){
                    st.pop();
                }

                checker = false;
                break;
            }

            if(checker){
                st.push(num);
            }
        }

        int[] result = new int[st.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = st.peek();
            st.pop();
        }

        return result;
    }
}
