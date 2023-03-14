public class searchInsert2 {
    public int searchInsert(int[] nums, int target) {

        // this solution is for O(n) with a straight forward approach.
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
