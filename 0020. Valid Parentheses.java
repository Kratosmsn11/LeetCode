class Solution {
    public boolean isValid(String s) {

        /*
            Ideation:

            1) add the respective closing bracket in the stack for each opening bracket.

            2) if at any point the stack "tracker" is empty or the top of the stack is 
               not equal to the current element we return false.

            3) In the end, we just check if the stack is empty,
               a) if it is empty we know that all the brackets have been closed.
               b) if it is not empty that means the input string has some extra open brackets.
        */
      
        Stack<Character> tracker = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                tracker.push(')');
            }else if(c == '{'){
                tracker.push('}');
            }else if(c == '['){
                tracker.push(']');
            }else if(tracker.isEmpty() || tracker.pop() != c){
                return false;
            }
        }

        return tracker.isEmpty();
    }
}
