// two pass solution
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;

      // adding the even numbers first in the result array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[k++] = nums[i];
            }
        }

      // adding the odd numbers first in the result array
        for(int j = 0; j < nums.length; j++){
            if(nums[j] % 2 == 1){
                res[k++] = nums[j];
            }
        }
        
        return res;
    }
}
