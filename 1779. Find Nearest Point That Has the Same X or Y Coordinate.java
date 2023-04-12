class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = 10000;
        int idx = -1;
        for(int i = 0; i < points.length; i++){
            if((points[i][0] == x) || (points[i][1] == y)){
                int temp = Math.abs((x-points[i][0])) + Math.abs((y-points[i][1]));
                if(min > temp) {
                    min = temp;
                    idx = i;
                }
            }
        }
        return idx;
    }
}
