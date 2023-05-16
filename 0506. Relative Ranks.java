class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> map = new HashMap<>();
        String[] res = new String[score.length];
        
        int[] sorted = new int[score.length];
        for(int i = 0; i < score.length; i++) sorted[i] = score[i];
        Arrays.sort(sorted);

        int count = 0;
        for(int i = score.length-1; i >= 0; i--){
            count++;
            if(count == 1) map.put(sorted[i], "Gold Medal");
            else if (count == 2) map.put(sorted[i], "Silver Medal");
            else if (count == 3) map.put(sorted[i], "Bronze Medal");
            else map.put(sorted[i], Integer.toString(count));
        }

        for(int i = 0; i < sorted.length; i++) res[i] = map.get(score[i]);

        return res;
    }
}
