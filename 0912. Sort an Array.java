class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] array, int start, int end){

        // need to check if the start index is less than the end index
        if(start < end){

            // finding the middle index
            int mid = start + (end-start)/2;

            // sorting the first half of the array
            sort(array, start, mid);

            // sorting the second half of the array
            sort(array, mid+1, end);

            // merging the two subarrays
            merge(array, start, mid, end);
        }
    }

    private void merge(int[] array, int start, int mid, int end){
        // finding the sizes of the 2 subarrays
        int n1 = mid - start + 1;
        int n2 = end - mid;
        System.out.println(" array length : " + array.length + " n1 " + n1 + " n2 " + n2);

        // creating 2 temp arrays equal to the size of the subarrays repectively
        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        // copying the elements of 1st subarray into temp1
        for(int i = 0; i < n1; i++){
            temp1[i] = array[start + i];
        }

        // copying the elements of 2nd subarray into temp2
        for(int j = 0; j < n2; j++){
            temp2[j] = array[mid + 1 + j];
        }

        // declaring variable for temp1, temp2 & array respectively;
        int a = 0, b = 0, k = start;
        while(a < n1 && b < n2){
            if(temp1[a] <= temp2[b]){
                array[k] = temp1[a];
                a++;
            }else{
                array[k] = temp2[b];
                b++;
            }
            k++;
        }

        // copying the remaining element of temp1 into array
        while(a < n1){
            array[k] = temp1[a];
            a++;
            k++;
        }

        // copying the remaining element of temp2 into array
        while(b < n2){
            array[k] = temp2[b];
            b++;
            k++;
        }
    }

}
