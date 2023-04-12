class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        if((first >= 0) && (first < nums.length) && (nums[first] == target)){
            res[0] = first;
            res[1] = last;
        }

        return res;

    }
    private int findFirst(int[] nums, int target){
        int i=-1, j = nums.length;

        // i < ans <= j
        while((i+1) != j){
            int mid = i + (j-i)/2;
            if(nums[mid] >= target) j = mid;
            else i = mid;
        }
        return j;
    }
    
    private int findLast(int[] nums, int target){
        int i=-1, j = nums.length;

        // i <= ans < j
        while((i+1) != j){
            int mid = i + (j-i)/2;
            if(nums[mid] > target) j = mid;
            else i = mid;
        }
        return i;
    }
    }
