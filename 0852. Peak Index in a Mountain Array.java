class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // using two variables start & end.
        int start = 0, end = arr.length - 1;

        // approach : binary search
        while(start < end){
            // calculating mid using start & end.
            int mid = start + (end - start)/2;

            // IF an element at mid is greater than an element at mid + 1,
            // then we know that the mid or any index smaller than mid is
            // the peak. 
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            // Else the mid we move to check the later half, by setting the
            // start to mid + 1.
            else{
                start = mid + 1;
            }
        }
        
        // we can return either start or end as both are equal.
        return start;
    }
}
