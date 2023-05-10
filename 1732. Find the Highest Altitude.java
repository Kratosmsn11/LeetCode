class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, res = 0;
        for(int i = 0; i<gain.length; i++){
            altitude += gain[i];
            res = Math.max(res, altitude);
        }
        return res;
    }
}
