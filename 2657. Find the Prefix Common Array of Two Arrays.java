class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int curr = 0, seen[] = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            if(++seen[A[i]] == 2) curr++;
            if(++seen[B[i]] == 2) curr++;
            B[i] = curr;
        }

        return B;
    }
}
