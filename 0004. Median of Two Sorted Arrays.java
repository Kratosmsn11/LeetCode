class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0,j = 0,k = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n1+n2];
        double result = 0;

        while(i < n1){
            arr[k++]= nums1[i++];
        }
        
        while(j < n2){
            arr[k++] = nums2[j++];
        }

        Arrays.sort(arr);

        int n = arr.length;
        if(n%2 == 0){
            result = (double)(arr[(n/2)-1]+arr[n/2])/2;
        }else{
            result = arr[n/2];
        }

        return result;
    }
}
