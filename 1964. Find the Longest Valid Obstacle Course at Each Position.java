class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int[] res = new int[obstacles.length];
        ArrayList<Integer> best = new ArrayList<>();

        for(int i = 0; i < obstacles.length; i++){
            int s = 0, e = best.size();
            while(s < e){
                int mid = s + (e-s)/2;
                if(best.get(mid) > obstacles[i]) e = mid;
                else s = mid+1;
            }

            if(s == best.size()) best.add(obstacles[i]);
            else best.set(s, obstacles[i]);

            res[i] = s+1;
        }

        return res;
    }
}
