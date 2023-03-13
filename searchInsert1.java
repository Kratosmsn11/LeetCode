public class searchInsert1 {
    public int searchInsert(int[] nums, int target) {
        // this solution is for O(log n) using binary search with an iterative approach.
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
