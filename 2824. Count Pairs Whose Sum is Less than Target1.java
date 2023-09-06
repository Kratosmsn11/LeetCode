// using Binary Search
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int res = 0; 
        int start = 0, end = nums.size() - 1;

        while(start < end){
            if(nums.get(start) + nums.get(end) < target){
                res += end - start;
                start++;
            }else{
                end--;
            }
        }

        return res;
    }
}
