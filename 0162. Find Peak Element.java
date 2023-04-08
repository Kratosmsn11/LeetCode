class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i<j){
            int mid = i + (j-i)/2;
            if(nums[mid] > nums[mid+1]) j = mid;
            else i = mid+1;
        }
        return i;
    }
}
