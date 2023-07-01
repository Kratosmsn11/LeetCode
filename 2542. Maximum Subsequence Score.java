class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for(int i = 0; i < n; i++){
            pairs[i] = new int[]{nums1[i], nums2[i]};
        }

        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);

        PriorityQueue<Integer> topHeap = new PriorityQueue<>(k, (a, b) -> a-b);
        long topSum = 0;
        for(int i = 0; i < k; i++){
            topSum += pairs[i][0];
            topHeap.add(pairs[i][0]);
        }

        long res = topSum * pairs[k-1][1];

        for(int i = k; i < n; i++){
            topSum += pairs[i][0] - topHeap.poll();
            topHeap.add(pairs[i][0]);

            res = Math.max(res, topSum * pairs[i][1]);
        }

        return res;
    }
}
