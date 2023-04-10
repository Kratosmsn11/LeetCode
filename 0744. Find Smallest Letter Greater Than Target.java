class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, j = letters.length-1;

        if(target>letters[j]) return letters[0];

        while(i<=j){
            int mid = i + (j-i)/2;
            if(letters[mid]>target) j = mid-1;
            else i = mid+1;
        }
        return letters[i%letters.length];
    }
}
