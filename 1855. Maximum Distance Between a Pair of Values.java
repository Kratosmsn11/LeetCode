class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        
        for(int i = 0; i < nums1.length; i++){
            int start = i, end = nums2.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;
                
                if(nums2[mid]>=nums1[i]){
                    if(max < mid-i) max = mid-i;
                    else start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return max;
    }
}
