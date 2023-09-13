// using a stack to keep a track of the occurence and order of the elements in s
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> appearence = new Stack<>();

        for(char c: s){
            appearence.add(c);
        }

        int i = 0;
        while(!appearence.isEmpty()){
            s[i++] = appearence.pop();
        }
    }
}
