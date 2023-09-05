class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }

        return numberOfSteps(num%2 == 0 ? num/2 : num-1) + 1;
    }
}
