class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int i = 0, j = 10000000, minSpeed = -1;

        while(i <= j){
            int mid = i + (j - i)/2;

            if(isPossible(dist, mid, hour)){
                minSpeed = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return minSpeed;
    }

    private boolean isPossible(int[] dist, int speed, double hour){
        int n = dist.length;
        double time = 0.0;

        for(int i = 0; i < n; i++){
            double temp = dist[i]*1.0 / speed;

            time += (i != n - 1) ? Math.ceil(temp) : temp;
            
            if(time > hour){
                return false;
            }
        }

        return true;
    }
}
