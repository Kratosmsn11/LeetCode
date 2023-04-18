class Solution {
    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int start = 0, end = arr.length-1;
            int target = 2*arr[i];
            while(start<=end){
                int mid = start + (end-start)/2;
                if((arr[mid] == target) && (i!=mid)) return true;
                else if(arr[mid]>target) end = mid-1;
                else start = mid+1;
            }
        }
        return false;

    }
}
