class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[10000];
        Arrays.sort(nums);
        int max = nums[nums.length-1];

        for(int i=0; i<nums.length; i++) arr[nums[i]]++;

        for(int i=0; i<=max+1; i++){
            if(arr[i]==0) return i;
        }

        return 0;
    }
}
