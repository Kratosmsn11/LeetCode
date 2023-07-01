class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int s = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int i = 0;
        int[] res = new int[k];
        while(!pq.isEmpty()){
            res[i++] = pq.poll().getKey();
        }
        return res;
    }
}
